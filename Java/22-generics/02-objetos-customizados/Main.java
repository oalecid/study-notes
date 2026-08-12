import java.util.List;
import java.util.ArrayList;

// Algumas classes para os exemplos
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

// O exibidor de nomes consegue manipular independentemente do tipo que receber
// com tanto que o tipo seja descendente "Pessoa"
class ListaDePessoas<T extends Pessoa> {
  private List<T> lista = new ArrayList<>();
  
  public void adicionarPessoa(T novaPessoa) {
    lista.add(novaPessoa);
  }

  public T obterPessoa(int indice) {
    // Sem o generic (usando diretamente a superclasse), ao pegar o valor via obterPessoa(),
    // não seria possível usar seus métodos customizados, como o atacar() e minerar()

    // Sem o generic, provavelmente seria necessário usar o tipo Object
    // e depois fazer uma verificação/conversão de tipo com instanceof e casting
    // se quisesse usar os métodos atacar() e minerar()
    // depois de obter o valor via obterPessoa()

    return lista.get(indice);
  }

  public void exibirNomeCompleto(int indice) {
    T pessoaAtual = lista.get(indice);

    System.out.println(String.format("%s %s", pessoaAtual.getNome(), pessoaAtual.getSobrenome()));
  }
}

public class Main {
  public static void main(String[] args) {
    ListaDePessoas<Guerreiro> listaDeGuerreiros = new ListaDePessoas<>();
    
    listaDeGuerreiros.adicionarPessoa(new Guerreiro("Guerreiro", "Fulano"));
    
    listaDeGuerreiros.exibirNomeCompleto(0);
    listaDeGuerreiros.obterPessoa(0).atacar(); // <- o generic permite que usemos atacar()


    ListaDePessoas<Ferreiro> listaDeFerreiros = new ListaDePessoas<>();

    listaDeFerreiros.adicionarPessoa(new Ferreiro("Ferreiro", "Cicrano"));
    
    listaDeFerreiros.exibirNomeCompleto(0);
    listaDeFerreiros.obterPessoa(0).minerar();
  }
}