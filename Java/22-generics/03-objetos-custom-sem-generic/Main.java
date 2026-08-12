/*
  Em versões mais antigas do Java
  pode ser necessário fazer desta forma

  É possível usar o instanceof para verificar se o tipo
  é o desejado se ele tiver um tipo muito genérico
  como Object, por exemplo
*/

import java.util.ArrayList;
import java.util.List;

class Pessoa {
  private String nome;
  private String sobrenome;

  Pessoa(String nomeInit, String sobrenomeInit) {
    nome = nomeInit;
    sobrenome = sobrenomeInit;
  }

  public String getNome() {
    return nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }
}

class Guerreiro extends Pessoa {
  Guerreiro(String nomeInit, String sobrenomeInit) {
    super(nomeInit, sobrenomeInit);
  }

  void atacar() {
    System.out.println("ataaaaacaaaaarrr!!!");
  }
}

class Ferreiro extends Pessoa {
  Ferreiro(String nomeInit, String sobrenomeInit) {
    super(nomeInit, sobrenomeInit);
  }

  void minerar() {
    System.out.println("mineeeeraaaaaarrrr!!!");
  }
}

class ListaDePessoasDepreciada {
  private List<Object> lista = new ArrayList<>();
  
  public void adicionarPessoa(Object novaPessoa) {
    lista.add(novaPessoa);
  }

  public Object obterPessoa(int indice) {
    return lista.get(indice);
  }
}

public class Main {
  public static void main(String[] args) {
    ListaDePessoasDepreciada listaDeGuerreiros = new ListaDePessoasDepreciada();
    
    listaDeGuerreiros.adicionarPessoa(new Guerreiro("Guerreiro", "Fulano"));
  
    Object guerreiro1 = listaDeGuerreiros.obterPessoa(0);

    // Sem o generic, é preciso primeiro verificar se o tipo está correto
    // E depois fazer uma conversão
    if (guerreiro1 instanceof Guerreiro) {
      Guerreiro guerreiro1Verificado = (Guerreiro) guerreiro1;

      guerreiro1Verificado.atacar();
    }

    // Outro exemplo
    ListaDePessoasDepreciada listaDeFerreiros = new ListaDePessoasDepreciada();

    listaDeFerreiros.adicionarPessoa(new Ferreiro("Ferreiro", "Cicrano"));
    
    Object ferreiro1 = listaDeFerreiros.obterPessoa(0);

    // A verificação com instanceof é para evitar erros durante a compilação
    // pois o casting pode não disparar erro logo de cara
    if (ferreiro1 instanceof Ferreiro) {
      Ferreiro ferreiro1Verificado = (Ferreiro) ferreiro1;

      ferreiro1Verificado.minerar();
    }

    // Sem a verificação, isso aqui abaixo seria permitido na compilação
    // mas daria erro ao executar de fato:

    // Guerreiro ferreiro1Verificado = (Guerreiro) ferreiro1;

    // ferreiro1Verificado.atacar();
  }
}