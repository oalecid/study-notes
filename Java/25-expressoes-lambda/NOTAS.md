# Expressões Lambda

São formas menores de escrever funções mantendo o mesmo comportamento.

São formadas por:
- **Argumentos**: Parâmetros da função, cujos tipos podem ser indicados explicitamente ou calculados automaticamente pelo compilador

- **Seta ->**: Separa os argumentos do corpo da função

- **Corpo da função**: Contém o que será executado

## Regras adicionais

- Os parênteses são opcionais se houver só um parâmetro

- Se o parâmetro tiver tipo explícito, os parênteses são obrigatórios

- As chaves são opcionais se houver só uma instrução
  - Isso também serve para **if**

- Dentro da expressão lambda só é possível acessar variáveis de fora se elas forem **final** (constantes)
  - Se a variável existir sem ser final e for acessada na expressão lambda, o compilador pode aceitar e tratá-la como final mesmo que isso não esteja especificado

  - ENTRETANTO, se houver alteração na variável, mesmo que antes do uso, ocorrerá erro. Tem que pelo menos parecer final.

  - Dentro da expressão é possível declarar variáveis a vontade e alterar seus valores
