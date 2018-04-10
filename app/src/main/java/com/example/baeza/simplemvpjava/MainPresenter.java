package com.example.baeza.simplemvpjava;

import android.content.Context;

public class MainPresenter implements MainManager.Presenter {
    /*
     * El presentador esta en  contacto tanto con el modelo como con la
     * vista, entonces necesitamos declarar las interfaces tanto
     * de la vista como del modelo
     * */

    private MainManager.Model model;
    private MainManager.View view;

    /*
     * Creamos un constructor para el presenter el cual recibira
     * una vista
     * */

    public MainPresenter(MainManager.View view, Context context) {
        this.view = view;
        model = new MainModel(this, context);
    }

    @Override
    public void showName(String name) {
        //comprobamos que tenemos la vista
        if (view != null) {
            view.showName(name);
        }
    }

    @Override
    public void changeColorView(int colorString) {
        if (view != null) {
            view.changeColorView(colorString);
        }
    }

    @Override
    public void changeName() {
        if (view != null) {
            model.changeName();
        }
    }

    @Override
    public void changeColorModel() {
        if (view != null) {
            model.changeColorModel();
        }
    }
}
