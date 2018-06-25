package com.zxn.design;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface INetService {
    String TOP_URL = "https://gitee.com/little_bird_oh_777/test_data_collection/raw/master/toplins.json";
    String VIDEO_URL = "https://gitee.com/little_bird_oh_777/test_data_collection/raw/master/video.json";

    @GET()
    Call<Bean> getDate(@Url String url);
}
