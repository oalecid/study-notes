# Módulos

São como caixas de ferramentas organizadas. Foram lançados no Java 9.

## Exemplos de módulos

- **javafx.controls**: Módulo de componentes gráficos
- **javafx.web**: Módulo de integração de conteúdo da web
- **javafx.media**: Módulo de reprodução de áudio e vídeo

## Exemplo de compilação
```bash
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls MinhaAplicacao.java
```

Ou, se você preferir configurar uma variável de ambiente:

Para Windows:

```bash
javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls MinhaAplicacao.java
```

Para Linux:

```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls MinhaAplicacao.java
```

## Exemplo de execução
```bash
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls MinhaAplicacao
```

Ou, se você preferir configurar uma variável de ambiente:

Para Windows:

```bash
java --module-path "%PATH_TO_FX%" --add-modules javafx.controls MinhaAplicacao
```

Para Linux:
```bash
java --module-path $PATH_TO_FX --add-modules javafx.controls MinhaAplicacao
```