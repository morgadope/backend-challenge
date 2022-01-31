package com.morgado.backendchallenge.domain.service;

import com.morgado.backendchallenge.domain.request.ValidaSenhaRequest;
import com.morgado.backendchallenge.domain.response.ValidaSenhaResponse;

public interface ValidaSenhaService {

    ValidaSenhaResponse validarSenha(ValidaSenhaRequest validaSenhaRequest);
}
