package com.desafio.desafio.service;

import com.desafio.desafio.model.Contrato;

public interface ContratoService {
    Iterable<Contrato> busca();
    Contrato buscaPorId(Long id);
    Contrato adicionar(Contrato contrato);
    void atualizar(Long id, Contrato contrato);
    void remover(Long id);
}
