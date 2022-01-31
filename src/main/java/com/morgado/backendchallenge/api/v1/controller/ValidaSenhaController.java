package com.morgado.backendchallenge.api.v1.controller;

import com.morgado.backendchallenge.domain.request.ValidaSenhaRequest;
import com.morgado.backendchallenge.domain.service.ValidaSenhaService;
import com.morgado.backendchallenge.api.v1.resource.ValidaSenhaResource;
import com.morgado.backendchallenge.domain.response.ValidaSenhaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidaSenhaController implements ValidaSenhaResource {

    @Autowired
    private ValidaSenhaService validaSenhaService;

    @Override
    public ResponseEntity<ValidaSenhaResponse> validaSenha(ValidaSenhaRequest validaSenhaRequest) {
        var response = validaSenhaService.validarSenha(validaSenhaRequest);
        return ResponseEntity.ok(response);
    }
}
