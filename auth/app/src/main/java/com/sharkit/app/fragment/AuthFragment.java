package com.sharkit.app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.sharkit.app.R;
import com.sharkit.app.module.DaggerServiceComponet;
import com.sharkit.app.widget.AuthWidget;
import com.sharkit.app.widget.DaggerWidgetComponent;
import com.sharkit.domain.service.AuthService;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class AuthFragment extends Fragment {

    @Inject
    protected AuthService authService;
    private AuthWidget authWidget;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.auth_fragment, container, false);
        final AuthWidget authWidget = this.givenAuthWidget(view);

        authService.save();

        return view;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.authService = DaggerServiceComponet.create().authService();
    }

    private AuthWidget givenAuthWidget(final View view) {
        return DaggerWidgetComponent.builder()
                .view(view)
                .build()
                .getAuthWidget();
    }
}
