# Anotações do projeto

## Geração de números aleatórios

O Java tem uma classe especial para geração de números aleatórios com segurança que fica em **java.security.SecureRandom**.

Nesse projeto a ideia é:
- Definir um conjunto de caracteres que serão usados na senha
- Gerar um índice aleatório dentro do comprimento da String para obter um caractere aleatório
- Repetir esse processo até obter o comprimento de senha desejado
- Ir unindo todos os caracteres obtidos até formar a senha

## StringBuilder

A classe StringBuilder serve para lidar com strings que passarão por muitas alterações, contatenações, etc.

## Scanner

Com a classe Scanner é possível receber valores pelo terminal.

É possível especificar o tipo. Se você quiser receber inteiros, por exemplo, use **scanner.nextInt()**. Se quiser uma string, você pode usar **scanner.nextLine()** para pegar a próxima linha.