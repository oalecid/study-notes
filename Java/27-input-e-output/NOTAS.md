# Input e Output

Basicamente, Input e Output está relacionado a receber dados de um local ou salvar informações nele.

No Java, existe uma API mais antiga para trabalhar com input e output e existe uma mais moderna e robusta, a NIO.

## Serialização

Serialização no Java é o processo de transformar um objeto em pequenos pedaços para que ele possa ser salvo, por exemplo.

## APIs bloqueantes

A API antiga **java.io** é bloqueante, ou seja, enquanto o arquivo estiver aberto o sistema operacional fica esperando a ação terminar para utilizá-lo. Por isso é necessário fechar os itens com **close()**.

Já a NIO não precisa disso, pois não bloqueia os processamentos do sistema operacional.