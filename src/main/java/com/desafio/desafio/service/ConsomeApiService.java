package com.desafio.desafio.service;

import com.desafio.desafio.model.Contrato;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "consomeapi", url = "localhost:8080")
public interface ConsomeApiService {
    @RequestMapping(method = RequestMethod.GET, value = "/{id}/json")
    Contrato busca(@PathVariable("id") String cep);
}
