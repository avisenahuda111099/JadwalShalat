package com.example.jadwalshalat.service;
import com.example.jadwalshalat.model.sholat.SholatDiscoverResponse;
import com.example.jadwalshalat.model.sholat.Timings;
import com.example.jadwalshalat.service.ApiMain;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface SholatRepository {

    @GET("v1/calendarByAddress?address=Jakarta,Indonesia&method=2&month=01&year=2020")
    Call<SholatDiscoverResponse> getSholatDiscover();


}


