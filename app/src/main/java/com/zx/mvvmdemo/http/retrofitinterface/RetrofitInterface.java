package com.zx.mvvmdemo.http.retrofitinterface;

import com.zx.mvvmdemo.bean.GirlsData;
import com.zx.mvvmdemo.bean.NewsBean;
import com.zx.mvvmdemo.bean.NewsData;
import com.zx.mvvmdemo.bean.SCAdvertisementModel;
import com.zx.mvvmdemo.bean.SCResponseModel;
import com.zx.mvvmdemo.constant.URLConstant;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface RetrofitInterface {

    //获取“分类中搜索商品”的数据
    @GET(URLConstant.URL_PATH)
    Observable<NewsBean> getNewsData();

    @GET("compile/data/Android/{size}/{index}")
    Observable<NewsData> getAndroidData(@Path("size") String size, @Path("index") String index);

    @GET  ("compile/data/福利/{size}/{index}")
    Observable<GirlsData> getFuliData(@Path("size") String size, @Path("index") String index);

    @GET("services/RestServices/yundihealth/messageCenter/advert")
    Call<SCResponseModel<List<SCAdvertisementModel>>> getAdvertisement(@Query("comcode") String comCode);
}