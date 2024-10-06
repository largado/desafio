package com.desafio.desafio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioContrato extends CrudRepository<Contrato, Long> {
}
