package com.zxn.design;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TopFragment extends Fragment {

    @BindView(R.id.fm_rv)
    RecyclerView fmRv;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        TextView view = new TextView(getContext());
//        view.setText("这是头条啊!!!");
//        return view;
        View view = inflater.inflate(R.layout.fragment_layout_rv, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fmRv.setHasFixedSize(true);
        fmRv.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        fmRv.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));


        new Retrofit.Builder()
                .baseUrl("https://gitee.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(INetService.class)
                .getDate(INetService.TOP_URL)
                .enqueue(new Callback<Bean>() {
                    @Override
                    public void onResponse(Call<Bean> call, Response<Bean> response) {
                        Bean bean = response.body();
                        Log.i("onResponse", "onResponse: ".concat(bean.toString()));
                        List<Bean.DataBean> data = bean.getData();
                        fmRv.setAdapter(new TopAdapter(data));
                    }

                    @Override
                    public void onFailure(Call<Bean> call, Throwable t) {

                    }
                });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
