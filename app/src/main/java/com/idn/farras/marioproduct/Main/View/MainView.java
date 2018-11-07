package com.idn.farras.marioproduct.Main.View;

import com.idn.farras.marioproduct.Base.BaseView;
import com.idn.farras.marioproduct.Main.Model.AmiiboItem;

import java.util.List;

public interface MainView extends BaseView {
    void onError(String msg);
    void onSuccess(List<AmiiboItem> data);
}
