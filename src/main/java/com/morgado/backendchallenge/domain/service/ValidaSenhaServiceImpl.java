package com.morgado.backendchallenge.domain.service;

import com.morgado.backendchallenge.domain.usecase.Senha;
import com.morgado.backendchallenge.domain.request.ValidaSenhaRequest;
import com.morgado.backendchallenge.domain.response.ValidaSenhaResponse;
import org.springframework.stereotype.Service;

@Service
public class ValidaSenhaServiceImpl implements ValidaSenhaService{


    @Override
    public ValidaSenhaResponse validarSenha(ValidaSenhaRequest validaSenhaRequest) {
        var senha = new Senha(validaSenhaRequest.getSenha());
        return new ValidaSenhaResponse(senha);
    }
}
