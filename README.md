# extrato #

#Como funciona#

O usuario ira acessar a pagina raiz do sistema e o mesmo irá exibir um link para ser acionado e com isso exibir os lançamentos.
  
#Java Developer#

O projeto foi desenvolvido utilizando o pacote de serviços de bootstrap do Spring (Spring Boot) bem como todas as suas facilidades.

##O projeto de extrato esta dividido em 3 módulos.##
  - extrato - Raiz do projeto.
  - api - Api REST a ser exposta.
  - front - Front End desenvolvido com AngularJS.
  
##Pré requisitos##
  - Java 1.8
    
##Ferramentas utilizadas##
  - Java 1.8
  - Maven
  - Spring (Boot, Core, REST)
  - Swagger
  - Angularjs 1
  - Bootstrap-css
  - WRO4J
    
#Executando aplicação#
  
Na raiz do projeto (extrato), deve-se executar o seguinte comando para efetuar o build da aplicação.

```
mvn clean install
```

Entrar no módulo api

```
cd api
```
  
Efetuar o start da aplicação usando o spring boot.
    
```
mvn spring-boot:run
```
  
Acessar a aplicação pela url: 
  - http://localhost:8080
  
Para acessar a documentação da API pelo swagger, acessar o seguinte endereço:
  - http://localhost:8080/swagger-ui.html
    
