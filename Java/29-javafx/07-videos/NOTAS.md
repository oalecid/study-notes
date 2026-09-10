# Vídeos em JavaFX

Para lidar com vídeos no JavaFX é preciso usar o módulo **javafx.media** além do módulo **javafx.controls**.

Exemplo de compilação:
```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.media MinhaAplicacao.java
```

Exemplo de execução:
```bash
java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.media MinhaAplicacao
```

Lembrando, no Linux as variáveis são referenciadas usando o padrão **$PATH_TO_FX**, enquanto no Windows é via **"%PATH_TO_FX%"**

## Módulo javafx.media

Possui algumas classes úteis:

- **Media**: Representa uma fonte de mídia, como arquivos de áudio ou vídeo. Ela pode ser utilizada usando o caminho/URL até o arquivo ou um objeto file. Permite o acesso à informações gerais sobre a mídia
- **MediaPlayer**: Serve para controlar a reprodução da mídia. Precisa de uma instância de Media para funcionar. Fornece métodos pra reproduzir, pausar, etc. E o controle dos eventos relacionados à reprodução
- **MediaView**: Usada para exibir a mídia em uma cena JavaFX. Precisa de uma instância de MediaPlayer para funcionar