package com.helpmeproductions.willus08.mvpskeleton.view.activities.main_activity;


import com.helpmeproductions.willus08.mvpskeleton.view.BasePresenter;
import com.helpmeproductions.willus08.mvpskeleton.view.BaseView;

public interface MainContract {
    interface View extends BaseView{
        void showInfo(String info);
    }

    interface Presenter extends BasePresenter<View>{
        void getInfo();
    }
}
