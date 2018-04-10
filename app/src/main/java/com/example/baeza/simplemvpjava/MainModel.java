package com.example.baeza.simplemvpjava;

import java.util.Random;

import timber.log.Timber;

public class MainModel implements MainManager.Model {

    //El modelo solo esta en contacto con el presentador y no con la vista
    private MainManager.Presenter presenter;
    private int name;

    private String nameArray[] = {
            "Pedro",
            "Juan",
            "Ernesto",
            "Fernando",
            "Antonio"
    };

    public MainModel (MainManager.Presenter presenter){
    this.presenter = presenter;
    }

    @Override
    public void changeName() {
        name = new Random().nextInt(nameArray.length);
        Timber.d("Selected color "+nameArray[name]);
        presenter.showName(nameArray[name]);
    }
}
