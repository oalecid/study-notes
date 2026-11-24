package com.produtoapi.meu_projeto_springboot.controller;

import com.produtoapi.meu_projeto_springboot.model.Produto;
import com.produtoapi.meu_projeto_springboot.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// O controller lida com as requisições e chama os métodos adequados
// para cada uma

// @CrossOrigin(origins = "https://exemplo.com.br")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
  @Autowired
  private ProdutoService produtoService;

  @GetMapping
  public List<Produto> listarTodos() {
    return produtoService.listarTodos();
  }

  @PostMapping
  public Produto salvar(@RequestBody Produto produto) {
    return produtoService.salvar(produto);
  }

  @PutMapping("/{id}")
  public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
    return produtoService.atualizar(id, produto);
  }

  @DeleteMapping("/{id}")
  public void deletar(@PathVariable Long id) {
    produtoService.deletar(id);
  }

  @GetMapping("/{id}")
  public Optional<Produto> findById(@PathVariable Long id) {
    return produtoService.findById(id);
  }

  @PostMapping("/salvar-lista")
  public List<Produto> salvarLista(@RequestBody List<Produto> produtos) {
    return produtoService.salvarLista(produtos);
  }
}
