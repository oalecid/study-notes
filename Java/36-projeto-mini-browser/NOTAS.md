# Anotações do projeto

## Dependências transitivas - Compilação / execução com módulos do JavaFX - javafx.web

O módulo **javafx.web** depende do **java.controls** para funcionar. Logo, ao usar os comandos de compilação e execução, ao usar javafx.web não precisa passar o javafx.controls também, pois a importação será realizada automaticamente.