package com.desafio.desafio.service.imple;

import com.desafio.desafio.model.Contrato;
import com.desafio.desafio.service.ContratoService;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImple implements ContratoService {
    @Override
    public Iterable<Contrato> busca() {
        return null;
    }

    @Override
    public Contrato buscaPorId(Long id) {
        return null;
    }

    @Override
    public void adicionar(Contrato contrato) {

    }

    @Override
    public void atualizar(Long id, Contrato contrato) {

    }

    @Override
    public void remover(Long id) {

    }
}
