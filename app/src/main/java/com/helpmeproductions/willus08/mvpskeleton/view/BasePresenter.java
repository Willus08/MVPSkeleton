package com.helpmeproductions.willus08.mvpskeleton.view;



public interface BasePresenter<V extends BaseView>{
    void addView(V view);
    void removeView();
}
