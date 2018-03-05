package com.helpmeproductions.willus08.mvpskeleton.view.activities.main_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.helpmeproductions.willus08.mvpskeleton.R;
import com.helpmeproductions.willus08.mvpskeleton.view.injection.main_activity.DaggerMainComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDagger();
        presenter.addView(this);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setupDagger() {
        DaggerMainComponent.create().inject(this);
    }

    @Override
    public void showInfo(String info) {
        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    }
}
