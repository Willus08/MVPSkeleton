package com.helpmeproductions.willus08.mvpskeleton.view.activities.main_activity;


public class MainPresenter implements MainContract.Presenter {
   MainContract.View view;

    @Override
    public void addView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void getInfo() {
        String hello = "Hello World";
        view.showInfo(hello);
    }
}
