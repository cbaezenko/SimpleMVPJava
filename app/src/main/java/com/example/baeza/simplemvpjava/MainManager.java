package com.example.baeza.simplemvpjava;

public interface MainManager {
    public interface Model {
        //execute in the model
        void changeName();

        void changeColorModel();
    }

    public interface Presenter {
        //for the view
        void showName(String name);

        void changeColorView(int colorString);

        //for the model, execute in the presenter
        void changeName();

        void changeColorModel();
    }

    public interface View {
        void showName(String name);

        void changeColorView(int colorString);
    }
}
