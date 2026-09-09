/*
  O mesmo exemplo do diretório 01-inicio, mas agora com o try-with-resources
*/

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;

class Conta implements Serializable {
  public String nome;
  public String email;

  public Conta(String nomeInit, String emailInit) {
    nome = nomeInit;
    email = emailInit;
  }
}

public class Main {
  public static void exemploSerializar(String fileName, List<Conta> contas) {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
      outputStream.writeObject(contas);

      System.out.println("Cadastros salvos via serialização com sucesso!");
    } catch (IOException e) {
      System.out.println("Erro ao serializar: " + e.getMessage());
    }
  }

  public static void exemploDesserializar(String fileName) {
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
      Object dadosSalvos = inputStream.readObject();

      // Você pode fazer uma verificação para saber se o tipo do dado está correto
      // mas em casos em que você tem certeza do tipo que vai vir, às vezes o @SuppressWarnings já basta

      if (!(dadosSalvos instanceof List<?>)) {
        throw new IOException("O objeto salvo não é uma lista");
      }

      List<?> listaDeDados = (List<?>) dadosSalvos;

      for (Object dadoSalvo : listaDeDados) {
        if (!(dadoSalvo instanceof Conta)) {
          throw new IOException("O tipo da lista está incorreto");
        }
      }

      @SuppressWarnings("unchecked")
      List<Conta> contasSalvas = (List<Conta>) dadosSalvos;
      
      System.out.println("Dados desserializados e lidos com sucesso: ");

      for (Conta contaSalva : contasSalvas) {
        System.out.println(String.format("Nome: %s, Email: %s", contaSalva.nome, contaSalva.email));
      }
    } catch (ClassNotFoundException e) {
      System.out.println("Erro - A classe do objeto lido não é suportada: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Erro ao desserializar: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    List<Conta> contas = new ArrayList<>();

    contas.add(new Conta("test1", "test1@example.com"));
    contas.add(new Conta("test2", "test2@example.com"));

    String fileName = "cadastros.ser"; // ".ser" não é uma extensão obrigatória, mas é comum para serialização

    exemploSerializar(fileName, contas);
    exemploDesserializar(fileName);
  }
}