package com.sharkit.app.widget;

import android.view.View;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Named;

@Component
public interface WidgetComponent {

    AuthWidget getAuthWidget();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder view(View view);

        WidgetComponent build();
    }

}
