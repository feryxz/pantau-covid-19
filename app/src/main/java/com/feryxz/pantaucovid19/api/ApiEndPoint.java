package com.feryxz.pantaucovid19.api;

import com.feryxz.pantaucovid19.model.CountryModel;
import com.feryxz.pantaucovid19.model.RingkasanModel;
import com.feryxz.pantaucovid19.model.RiwayatModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Feryxz Dev on 21/05/2020.
 */

public interface ApiEndPoint {

    @GET(Api.END_POINT_WORLD_HISTORY)
    Call<List<RiwayatModel>> getHistoryList(@Path("date") String date);

    @GET(Api.END_POINT_SUMMARY_WORLD)
    Call<RingkasanModel> getSummaryWorld();

    @GET(Api.END_POINT_IDN)
    Call<CountryModel> getSummaryIdn();

}
