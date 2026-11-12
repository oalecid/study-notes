package com.produtoapi.meu_projeto_springboot.repository;

import com.produtoapi.meu_projeto_springboot.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

// Este arquivo facilita a conexão e realização de operações no banco de dados
// sem a necessidade de especificar cada operação de CRUD individualmente

// Long é o tipo da chave primária

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
