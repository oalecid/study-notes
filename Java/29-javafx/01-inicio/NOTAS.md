# JavaFX

Biblioteca Java que permite a construção de interfaces gráficas.

- Suporta várias plataformas (Windows, MacOS, Linux, etc.)

- Totalmente integrado ao Java

- Oferece recursos visuais avançados

- Oferece um layout flexível (VBox, HBox, GridPane)

- Permite personalizar itens com CSS

- Suporta gráficos 2D e 3D

- Suporta eventos e animações

## Dica para configuração no VSCode

Se ainda estiver na parte em que se escreve o código do JavaFX e se executa diretamente no terminal passando a opção --add-module, para obter o autocomplete no VSCode, é só colocar o **.vscode/settings.json** com a seguinte configuração:

```json
{
  "java.project.referencedLibraries": [
    "C:/Java/javafx-sdk-22.0.1/lib/*.jar"
  ]
}
```