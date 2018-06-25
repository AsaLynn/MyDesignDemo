package com.zxn.design;

import java.util.List;

public class Bean {

    @Override
    public String toString() {
        return "Bean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", success=" + success +
                ", data=" + data +
                '}';
    }

    /**
     * code : 0
     * data : [{"create_time":"2018-02-02 15:23:09","img_url":"http://img15.3lian.com/2016/h1/237/90.jpg","info_id":"19","title":"资讯10","view_num":"1"},{"create_time":"2018-02-02 15:23:26","img_url":"http://pic9.nipic.com/20100910/865813_110311071597_2.jpg","info_id":"20","title":"咨询11","view_num":"1"},{"create_time":"2018-03-22 10:09:23","img_url":"http://sc.jb51.net/uploads/allimg/140414/10-14041422141L58.jpg","info_id":"21","title":"","view_num":"1"},{"create_time":"2018-01-04 10:19:49","img_url":"http://img2015.zdface.com/20160801/c831e1ada701b66e29779c1a23e5d979.jpg","info_id":"12","title":"成为公认的智能锁行业领导者","view_num":"1"},{"create_time":"2018-01-31 15:21:29","img_url":"http://image.tupian114.com/20140326/03315620.jpg","info_id":"13","title":"来个牛排吧  大补","view_num":"1"},{"create_time":"2018-02-02 15:21:56","img_url":"http://imgx.xiawu.com/xzimg/i4/i2/T1HOdZFsdaXXXXXXXX_!!0-item_pic.jpg","info_id":"15","title":"资讯6","view_num":"1"},{"create_time":"2018-03-22 14:42:14","img_url":"http://5.26923.com/download/pic/000/327/d226b42404b9cd138d8ed7e09f54fefc.jpg","info_id":"22","title":"智能锁最常见的开门方式","view_num":"1"},{"create_time":"2018-02-02 15:21:35","img_url":"http://www.fzlol.com/upimg/allimg/161105/1_10454J4A.jpg","info_id":"14","title":"资讯5","view_num":"1"},{"create_time":"2018-01-04 10:15:42","img_url":"http://www.yesky.com//uploadImages/2015/155/50/OXK9SKI42O97.JPG","info_id":"10","title":"作为唯一受邀的智能单品代表，德施曼参加2017中国通信产业大会","view_num":"1"},{"create_time":"2018-02-02 15:22:13","img_url":"http://www.86ps.com/sc/RW/226/Star_003005.jpg","info_id":"16","title":"资讯7","view_num":"1"}]
     * msg : 获取成功
     * success : 1
     */

    private int code;
    private String msg;
    private int success;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        @Override
        public String toString() {
            return "DataBean{" +
                    "create_time='" + create_time + '\'' +
                    ", img_url='" + img_url + '\'' +
                    ", info_id='" + info_id + '\'' +
                    ", title='" + title + '\'' +
                    ", view_num='" + view_num + '\'' +
                    '}';
        }

        /**
         * create_time : 2018-02-02 15:23:09
         * img_url : http://img15.3lian.com/2016/h1/237/90.jpg
         * info_id : 19
         * title : 资讯10
         * view_num : 1
         */

        private String create_time;
        private String img_url;
        private String info_id;
        private String title;
        private String view_num;

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getInfo_id() {
            return info_id;
        }

        public void setInfo_id(String info_id) {
            this.info_id = info_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getView_num() {
            return view_num;
        }

        public void setView_num(String view_num) {
            this.view_num = view_num;
        }
    }
}
