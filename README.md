![POD](https://img.shields.io/badge/version-v1.0.0-green.svg) ![POD](https://img.shields.io/badge/language-Java-green.svg) 

# Validar Senha - REST API

O serviçoi foi criado para realizar a validação lógica de um senha enviada através de requisição POST na aplicação. 
Para que uma senha seja válida, os seguintes requisitos devem ser atendidos:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
    - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

Exemplo:

```c#
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```

> **_Nota:_**  Espaços em branco não devem ser considerados como caracteres válidos.

## Problema

Construa uma aplicação que exponha uma api web que valide se uma senha é válida.

Input: Uma senha (string).  
Output: Um boolean indicando se a senha é válida.

Embora nossas aplicações sejam escritas em Kotlin e C# (.net core), você não precisa escrever sua solução usando elas. Use a linguagem de programação que considera ter mais conhecimento.


## Tecnologias Utilizadas
- Para esse projeto, a seguinte stack foi escolhida:
  - Java 11;
  - SpringBoot 2.5.5;
  - Swagger Docs 3.0.0
  - Maven 3;

## Compilando a aplicação

Para compilar a aplicação, utilize a sua IDE de preferẽncia ou execute o seguinte comando no terminal/cmd:
```bash
mvn clean install 
```

## Executando a aplicação

Para executar a aplicação, execute na sua IDE de preferência a classe `com/morgado/backendchallenge/BackendChallengeApplication.java`
ou no seu terminal/cmd, execute o seguinte comando (na pasta da aplicação):
```bash
mvn spring-boot:run 
```

A aplicação irá subir localmente e estará exposta na porta 8080, que é a padrão utilizada pelo TomCat embarcado.

![](https://i.ibb.co/McySwMW/image.png)

## Utilizando a aplicação

Existem várias formas de se validar a senha utilizando a aplicação, como o Swagger e o postman com as requisições.


### Via Swagger:
Acesse o Swagger disponibilizado através da URL http://localhost:8080/swagger-ui/
A definição atual é a V1, já pensando em uma evolução de aplicação aplicada a versionamento de API. 
## Instancia AWS

### :cloud: Swagger da aplicação :arrow_forward: <a href= "shorturl.at/qCHUY"> Instância EC2 </a>

![](https://i.ibb.co/GCy6V5M/image.png)

Selecione a Controller _Valida Senha Controller_ recurso POST _/v1/validacoes/validacao_, clique em _try it out_ e preencha o
body da requisição de acordo com o modelo apresentado:
![](https://i.ibb.co/PWTyd54/image.png)

Ao clicar em *Execute* a requisição será realizada e a resposta booleana será obtida:
![](https://i.ibb.co/s3TfNTG/image.png)

### Via POSTMAN:




## Rotas

| Método HTTP | Tipo Rota | Endpoint                                         | Descrição                         |
|-------------|-----------|--------------------------------------------------|-----------------------------------|
| POST        | Pública   | `http://localhost:8080//v1/validacoes/validacao` | Recebe senha e retorna validação. |   

### Input
A aplicação espera receber uma requisição POST com um json no seguinte formato:

![](https://i.ibb.co/qyChtVz/image.png)

### Output
A aplicação deverá retornar um json contendo um valor booleano:


![](https://i.ibb.co/d2fqjTk/image.png)

## Instancia AWS 

### :cloud: Swagger da aplicação :arrow_forward: <a href= "shorturl.at/qCHUY"> Instância EC2 </a>
  