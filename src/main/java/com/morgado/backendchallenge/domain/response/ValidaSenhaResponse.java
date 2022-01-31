package com.morgado.backendchallenge.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.morgado.backendchallenge.domain.usecase.Senha;

public class ValidaSenhaResponse {

    @JsonProperty("is_valid")
    private boolean isValid;

    public ValidaSenhaResponse(Senha senha){
        this.isValid = senha.getIsValid();
    }

    @JsonIgnore
    public boolean isValid() {
        return isValid;
    }
}
