package com.sharkit.app.module;

import com.sharkit.domain.service.AuthService;
import dagger.Component;

@Component(modules = ServiceModule.class)
public interface ServiceComponet {

    AuthService authService();
}
