package com.helpmeproductions.willus08.mvpskeleton.view.injection.main_activity;


import com.helpmeproductions.willus08.mvpskeleton.view.activities.main_activity.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    public MainPresenter mainPresenterProvider(){
        return new MainPresenter();
    }
}
