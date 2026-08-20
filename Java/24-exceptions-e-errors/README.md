# Exceptions e Errors

No Java, para erros existem as classes Exception e Error.

- **Exception**: Para erros menores que podem ser tratados durante a execução do programa (exemplo: divisão por zero, etc.).
  - **Exceções verificadas (checked)**: São exceções em áreas fora do controle do programa. Causam erros de compilação e geralmente exigem colocar um try-catch em volta da area (exemplos: problemas de entradas inválidas do usuário, banco de dados, falhas de rede, arquivos ausentes, etc.)

  - **Exceções não verificadas (unchecked)**: São exceções em áreas controladas pelo código do programa, geralmente bugs/defeitos mesmo (exemplo: divisão por zero, etc.).

- **Error**: Para erros graves que precisam que o programa seja interrompido (exemplo: falta de memória, falha no sistema, etc.).
