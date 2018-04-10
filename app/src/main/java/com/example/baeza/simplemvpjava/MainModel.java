package com.example.baeza.simplemvpjava;

import android.content.Context;

import java.util.Random;

import timber.log.Timber;

public class MainModel implements MainManager.Model {

    //El modelo solo esta en contacto con el presentador y no con la vista
    private MainManager.Presenter presenter;
    private int name;
    private int color;
    private Context context;

    public MainModel(MainPresenter mainPresenter, Context context) {
        this.context = context;
        presenter = mainPresenter;
    }

    private String nameArray[] = {
            "Pedro",
            "Juan",
            "Ernesto",
            "Fernando",
            "Antonio"
    };

    @Override
    public void changeName() {
        name = new Random().nextInt(nameArray.length);
        Timber.d("Selected color " + nameArray[name]);
        presenter.showName(nameArray[name]);
    }

    @Override
    public void changeColorModel() {
        int colorArray[] = context.getResources().getIntArray(R.array.colorArray);
        color = new Random().nextInt(colorArray.length);
        presenter.changeColorView(colorArray[color]);
    }
}
