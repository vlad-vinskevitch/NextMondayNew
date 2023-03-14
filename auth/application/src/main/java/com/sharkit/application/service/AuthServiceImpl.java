package com.sharkit.application.service;

import com.sharkit.domain.repository.AuthRepository;
import com.sharkit.domain.service.AuthService;

import javax.inject.Inject;

public class AuthServiceImpl implements AuthService {

    private final AuthRepository authRepository;

    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public void save() {
        this.authRepository.save();
    }
}
