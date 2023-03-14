package com.sharkit.app.module;

import com.sharkit.application.service.AuthServiceImpl;
import com.sharkit.domain.repository.AuthRepository;
import com.sharkit.domain.service.AuthService;
import com.sharkit.infrastructure_firebase.auth.AuthRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    public AuthService bindsAuthService(AuthRepository authRepository) {
        return new AuthServiceImpl(authRepository);
    }

    @Provides
    public AuthRepository bindsAuthRepository(){
        return new AuthRepositoryImpl();
    }
}
