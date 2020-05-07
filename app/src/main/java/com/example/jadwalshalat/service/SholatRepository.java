package com.example.jadwalshalat.service;
import com.example.jadwalshalat.model.sholat.SholatDiscoverResponse;
import com.example.jadwalshalat.model.sholat.Timings;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SholatRepository {
    @GET("v1/calendarByAddress?address=Sultanahmet Mosque, Istanbul, Turkey&method=2&month=04&year=2017")
    Call<SholatDiscoverResponse> getSholatDiscover();
}
