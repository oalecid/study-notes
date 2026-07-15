# Observação

Note que as duas classes são do mesmo pacote, mas em arquivos separados, sem importações (mesmo que uma utilize a outra).

Para a compilação funcionar NESSE CASO, é preciso compilar TODOS os arquivos ao mesmo tempo.

```
javac *.java
```

Para executar, como o arquivo principal TAMBÉM está dentro do pacote, é preciso usar:

```
java test1.Test
```

Execute os comandos na raíz do diretório (folder 12-passagem-por-referencia) e não dentro de test1.