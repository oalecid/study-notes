package com.produtoapi.meu_projeto_springboot.model;

// Faz o spring mapear a classe para uma tabela de banco de dados
import jakarta.persistence.Entity;

// São usadas em conjunto para especificar o valor da chave primária
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Garante que o campo não esteja vazio
import jakarta.validation.constraints.NotEmpty;;

@Entity
public class Produto {
  // Chave primário gerada automaticamente
  // long aumenta o limite de valores
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotEmpty(message = "Informe um nome.")
  private String nome;
  private int quantidade;
  private double preco;
  private String status;

  public Produto(String nome, int quantidade, double preco, String status) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
    this.status = status;
  }

  public Produto() {
    // Construtor para caso queira passar sem nenhum valor
  }

  public long getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
