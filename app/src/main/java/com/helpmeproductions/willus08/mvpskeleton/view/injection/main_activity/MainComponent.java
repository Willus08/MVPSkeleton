package com.helpmeproductions.willus08.mvpskeleton.view.injection.main_activity;

import com.helpmeproductions.willus08.mvpskeleton.view.activities.main_activity.MainActivity;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
