# WebView

WebView serve para renderizar conteúdos da web como se fosse em um mini navegador embutido. Para lidar com isso, é preciso usar o módulo para web **javafx.web**.

Esse módulo possui uma classe muito útil, a **WebView**, que está em **javafx.scene.web**.

Acredito que os exemplos do curso foram mais focados em carregar **vídeos** de plataformas da web, mas usando o mesmo conceito de WebView.

Para compilar:
```bash
javac --module-path $PATH_TO_FX --add-modules javafx.web MinhaAplicacao.java
```

Para executar:
```bash
java --module-path $PATH_TO_FX --add-modules javafx.web MinhaAplicacao
```

## IMPORTANTE

### Sobre as versões
É importante que as versões do Java e do JavaFX estejam corretamente sincronizadas, pois alguns módulos dos quais o JavaFX depende foram depreciados em versões mais recentes do Java, o que pode causar erros.

No meu caso, a variável JAVA_HOME e PATH_TO_FX estavam corretas, porém a configuração do PATH estava fazendo uma versão diferente do Java ter precedência. Por isso, no meu caso específico, foi preciso entrar nas configurações do PATH e mover a linha que apontava pro bin do JAVA_HOME para o topo.

### Sobre erros de execução
Nos meus testes, tentei carregar uma página de vídeo do youtube, porém me pareceu um pouco instável.