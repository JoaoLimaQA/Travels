# Teste Técnico Para Praticar Automação de Testes

Este projeto foi elaborado pensando em garantir uma cobertura de testes.

##  Requisitos
* Java 11+ JDK deve estar instalado
* Maven deve estar instalado e configurado no path da aplicação


## :open_file_foder: Estrutura do projeto

````text

|__src (java root path projeto)
    |__main
    |  |__java
    |  |    |__core
    |  |    |     |__BasePage
    |  |    |     |__DriverFactory
    |  |    |     |__Setup
    |  |    |__utils
    |  |        |__Enums
    |  |            |__Navegadores
    |  |___resources (contém arquivos de configuração caso haja)
    | 
    |__test
    |      |__action
    |      |__screen
    |      |__tests
    |__pom.xml (Contém as dependências relacionada ao projeto)
    |__.gitignore (Contém o diretório de arquivos que devem ser ignorados no momento do commit)   
````

## Como executar os testes
É Possivel executar pela propria IDE, selecionado qual Teste deseja executar e simplismente dar play no método <br>
do teste ou podera executar pela linha de comando atraves do comando:<br>

Rodar todos os testes<br>
```bash
mvn test  
```
Rodar teste especifico utilizando o nome da Tag<br>
```bash
mvn test  -Dgroups="add-cliente"
```
Rodas diversas Tags
```bash
mvn test  -Dgroups="add-cliente, excluir-cliente"
```
Não excutar alguma Tag
```bash
mvn -DexcludedGroups="slow"
```
Selecionar Browser
```bash
mvn test  -Dgroups="add-cliente",-DBrowser=HEADLESS
```
