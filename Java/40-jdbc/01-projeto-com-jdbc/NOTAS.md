# Anotações

# Configurar ambiente para o JDBC (Windows)

## 1. Baixar arquivos do curso e colocá-los na mesma pasta do programa

- sqlite-jdbc-3.46.0.0.jar
- slf4j-api-1.7.13.jar
- slf4j-simple-1.7.13.jar

## 2. Executar sysdm.cpl (ou acessar variáveis de ambiente)

## 3. Adicionar variável de ambiente

- Nome: CLASSPATH
- Valor: .;sqlite-jdbc-3.46.0.0.jar;slf4j-api-1.7.13.jar;slf4j-simple-1.7.13.jar

# IMPORTANTE PARA O PROJETO

Para rodar esse projeto específico é preciso compilar e rodar o arquivo **CriadorTabela.java** antes de tudo para criar a tabela de produtos.

# Sobre os arquivos de execução

**Main.java** contém uma versão em que o sistema foi utilizado via terminal.

**MinhaAplicacao.java** contém uma versão com interface gráfica criada via JavaFX.