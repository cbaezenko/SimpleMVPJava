package com.example.baeza.simplemvpjava;

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

    public MainPresenter(MainManager.View view) {
        this.view = view;
        model = new MainModel(this);
    }

    @Override
    public void showName(String name) {
        //comprobamos que tenemos la vista
        if (view != null) {
            view.showName(name);
        }
    }

    @Override
    public void changeName() {
        if (view != null) {
            model.changeName();
        }
    }
}
