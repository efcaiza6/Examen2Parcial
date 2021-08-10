/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.controller;

import ec.edu.espe.distribuidas.examen.model.PreguntaAutogestion;
import ec.edu.espe.distribuidas.examen.service.PreguntaAutogestionService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Windows Boo
 */
@Slf4j
@RestController
@RequestMapping("/api/preguntaAutogestion")
public class PreguntaAutogestionController {

    private final PreguntaAutogestionService service;

    public PreguntaAutogestionController(PreguntaAutogestionService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity obtenerActivos() {
        List<PreguntaAutogestion> pAutogestion = this.service.listByEstado("ACT");
        return ResponseEntity.ok(pAutogestion);
    }
}
