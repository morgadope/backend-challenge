package com.morgado.backendchallenge.usecase;

import com.morgado.backendchallenge.domain.usecase.Senha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[Senha] - testa de forma unitaria o metodo de validacao da senha")
public class SenhaTest {

    @Test
    @DisplayName("[Senha Invalida] - Retorna false quando senha tem apenas espacos em branco")
    void testaSenhaComEspacoemBranco(){
        var resultadoSenhaValidaObtida = new Senha(" ");
        Assertions.assertFalse(resultadoSenhaValidaObtida.getIsValid());

    }

    @Test
    @DisplayName("[Senha Invalida] - Retorna false quando senha tem menos de 9 caracteres")
    void testaSenhaComMenosDeNoveCaracteres(){
        var resultadoSenhaValidaObtida = new Senha("Itau@123    ");
        Assertions.assertFalse(resultadoSenhaValidaObtida.getIsValid());
    }

    @Test
    @DisplayName("[Senha Invalida] - Retorna false quando senha nao tem nenhuma letra minuscula")
    void testaSenhaSemLetraMinuscula(){
        var resultadoSenhaValidaObtida = new Senha("ITAU@1234");
        Assertions.assertFalse(resultadoSenhaValidaObtida.getIsValid());
    }

    @Test
    @DisplayName("[Senha Invalida] - Retorna false quando senha nao tem nenhuma letra maiuscula")
    void testaSenhaSemLetraMaiuscula(){
        var resultadoSenhaValidaObtida = new Senha("itau@1234");
        Assertions.assertFalse(resultadoSenhaValidaObtida.getIsValid());
    }

    @Test
    @DisplayName("[Senha Invalida] - Retorna false quando senha nao tem nenhum caractere especial")
    void testaSenhaSemCaractereEspecial(){
        var resultadoSenhaValidaObtida = new Senha("Itau12345");
        Assertions.assertFalse(resultadoSenhaValidaObtida.getIsValid());
    }

    @Test
    @DisplayName("[Senha Invalida] - Retorna false quando senha tem sequencia de caracteres")
    void testaSenhaComSequenciaDeCaracteres(){
        var resultadoSenhaValidaObtida = new Senha("Itau@2222");
        Assertions.assertFalse(resultadoSenhaValidaObtida.getIsValid());
    }

    @Test
    @DisplayName("[Senha Valida] - retorna true quando a senha corresponde aos requisitos")
    void testaSenhaValida(){
        var resultadoSenhaValidaObtida = new Senha("Itau@1234");
        Assertions.assertTrue(resultadoSenhaValidaObtida.getIsValid());
    }

}
