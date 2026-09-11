# Arquivos de estilo no JavaFX

Também é possível criar um arquivo de estilo css separado para configurar os estilos e atribuir, por exemplo, classes aos elementos para conectá-los aos estilos.

Para atribuir classes a elementos é possível usar o método **getStyleClass().add()** deles.

Para adicionar uma folha de estilo para uma cena, é possível usar **cena.getStylesheets().add()** passando o caminho do arquivo.

## IMPORTANTE: Sobre a compilação

Se forem alterados apenas os estilos CSS do arquivo de estilo, não é preciso compilar o código Java novamente, apenas executar.