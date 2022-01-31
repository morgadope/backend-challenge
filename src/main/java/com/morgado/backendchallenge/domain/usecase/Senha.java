package com.morgado.backendchallenge.domain.usecase;

import java.util.regex.Pattern;


public class Senha {

    /**
     * Padrao de Regex que garante que a String senha cumpra com os requisitos necessarios para serem consideradas
     * validas:
     * ^ ≥ inicio da String
     * (?=.*[A-Z]) ≥ ao menos uma letra maiúscula
     * (?=.*[!@#$%^&*()-+]) ≥  ao menos um caractere especial
     * (?=.*[a-z]) ≥ ao menos uma letra minuscula
     * (?=.*[0-9]) ≥ ao menos um digito numerico
     * (?!.*(.)\1) ≥ garante que a string nao possui caracteres repetidos em sequencia
     * .{9,}$ ≥ no minimo 9 caracteres
     *
     */
    private static final String PATTERN = "^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[0-9])(?!.*(.)\\1).{9,}$";

    private boolean isValid;

    public Senha(String senha){
        this.isValid = validaSenha(senha);
    }

    public boolean getIsValid(){
        return this.isValid;
    }

    private boolean validaSenha(String senha){
        return Pattern.matches(PATTERN, senha);
    }

}
