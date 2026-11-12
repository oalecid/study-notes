package com.produtoapi.meu_projeto_springboot.service;

import com.produtoapi.meu_projeto_springboot.model.Produto;
import com.produtoapi.meu_projeto_springboot.repository.ProdutoRepository;

// Autowired faz a injeção de dependências do Spring Boot
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

// Optional é um container que pode conter um valor ou pode estar vazia
// servindo para evitar null e prevenir NullPointerException
import java.util.Optional;

// O arquivo de service contém possíveis lógicas de negócio

@Service
public class ProdutoService {
  // Injeção de dependências do Spring via campo
  // também é possível injetar via constructor ou via setter
  @Autowired 
  private ProdutoRepository produtoRepository;

  public List<Produto> listarTodos() {
    return produtoRepository.findAll();
  }

  public Produto salvar(Produto produto) {
    return produtoRepository.save(produto);
  }

  public void deletar(Long id) {
    produtoRepository.deleteById(id);
  }

  public Produto atualizar(Long id, Produto produto) {
    if (produtoRepository.existsById(id)) {
      produto.setId(id);
      return produtoRepository.save(produto);
    } else {
      throw new RuntimeException("Produto não encontrado");
    }
  }

  public Optional<Produto> findById(Long id) {
    return produtoRepository.findById(id);
  }
}
