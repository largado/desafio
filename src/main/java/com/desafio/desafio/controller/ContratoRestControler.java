package com.desafio.desafio.controller;

import com.desafio.desafio.model.Contrato;
import com.desafio.desafio.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("contratos")
public class ContratoRestControler {

    @Autowired
    private ContratoService contratoService;

    @GetMapping
    public ResponseEntity<Iterable<Contrato>> busca() { return ResponseEntity.ok(contratoService.busca()); }

    @GetMapping("/{id}")
    public ResponseEntity<Contrato> buscaPorId(@PathVariable Long id){
        return ResponseEntity.ok(contratoService.buscaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Contrato> adicionar(@RequestBody Contrato contrato) {
        contratoService.adicionar(contrato);
        return ResponseEntity.ok(contrato);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Contrato> atualizar(@PathVariable Long id, @RequestBody Contrato contrato){
        contratoService.atualizar(id, contrato);
        return ResponseEntity.ok(contrato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        contratoService.remover(id);
        return ResponseEntity.ok().build();

    }
}
