package com.example.baeza.simplemvpjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class MainActivityView extends AppCompatActivity implements MainManager.View {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button_changeName)
    Button button_changeName;
    @BindView(R.id.button_changeColor)
    Button button_changeColor;

    private MainManager.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.plant(new Timber.DebugTree());
        ButterKnife.bind(this);

        //inicializamos el presenter con la clase
        mPresenter = new MainPresenter(this, getApplicationContext());
    }

    @Override
    public void showName(String name) {
        textView.setText(name);
    }

    @Override
    public void changeColorView(int colorString) {
        Timber.d("color es " + colorString);
        textView.setTextColor(colorString);
    }

    @OnClick(R.id.button_changeName)
    public void changeName() {
        mPresenter.changeName();
    }

    @OnClick(R.id.button_changeColor)
    public void changeColor() {
        mPresenter.changeColorModel();
    }
}
