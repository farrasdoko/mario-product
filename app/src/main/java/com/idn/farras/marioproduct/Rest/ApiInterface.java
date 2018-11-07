package com.idn.farras.marioproduct.Rest;

import com.idn.farras.marioproduct.Main.Model.ResponseMario;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/amiibo/?character=mario")
    Call<ResponseMario> getMario();
}
