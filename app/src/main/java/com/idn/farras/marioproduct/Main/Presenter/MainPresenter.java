package com.idn.farras.marioproduct.Main.Presenter;

import com.idn.farras.marioproduct.Base.BasePresenter;
import com.idn.farras.marioproduct.Main.Model.AmiiboItem;
import com.idn.farras.marioproduct.Main.Model.ResponseMario;
import com.idn.farras.marioproduct.Main.View.MainView;
import com.idn.farras.marioproduct.Rest.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements BasePresenter<MainView> {

    MainView mainView;

    public void getData(){
        call().enqueue(new Callback<ResponseMario>() {
            @Override
            public void onResponse(Call<ResponseMario> call, Response<ResponseMario> response) {
//               5.TODO pengecekan berhasil tidaknya
//                if (response.isSuccessful()){
//                    6. TODO jika data berhasil didapatkan
                    List<AmiiboItem> recipesItems = response.body().getAmiibo();
//                    7. TODO data dikembalikan ke view
                    mainView.onSuccess(recipesItems);
//                }else {
//                    mainView.onError("Gagal Mengambil Data");
//                }
            }

            @Override
            public void onFailure(Call<ResponseMario> call, Throwable t) {
                mainView.onError(t.getMessage());
            }
        });
    }


    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }

    Call<ResponseMario> call(){
        return ApiClient.getInstance().getMario();
    }
}
