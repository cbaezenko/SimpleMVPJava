package com.example.baeza.simplemvpjava;

public interface MainManager {
    public interface Model {
        //execute in the model
        void changeName();
    }

    public interface Presenter {
        //for the view
        void showName(String name);
        //for the model, execute in the presenter
        void changeName();
    }

    public interface View{
        void showName(String name);
    }
}
