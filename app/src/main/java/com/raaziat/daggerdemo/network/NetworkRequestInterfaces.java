package com.raaziat.daggerdemo.network;

import com.raaziat.daggerdemo.model.signin.signinRequest;
import com.raaziat.daggerdemo.model.signup.signupRequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkRequestInterfaces {
    @POST("clipapi/rest/users/sign-in")
    Call<signinRequest> SignIn(@Body signinRequest requestModelLogin);

    @POST("clipapi/rest/users/sign-up")
    Call<signupRequest> SignUp(@Body signupRequest requestSignUpModel);

//    @GET("placementapi/schedule/pages/daily/web")
//    Call<List<CouponResponse>> couponsRequest(
//                    @Query("startDate") String date,
//                    @Query("pageName") String coupon
//            );
//    @GET("placementapi/schedule/pages/daily/web")
//    Call<List<CashbackResponse>> cashbackRequest(
//            @Query("startDate") String date,
//            @Query("pageName") String coupon
//    );
}
