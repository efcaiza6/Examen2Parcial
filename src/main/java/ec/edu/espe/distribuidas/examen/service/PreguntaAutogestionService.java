/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.service;

import ec.edu.espe.distribuidas.examen.dao.PreguntaAutogestionRepository;
import ec.edu.espe.distribuidas.examen.model.PreguntaAutogestion;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows Boo
 */
@Service
public class PreguntaAutogestionService {

    private final PreguntaAutogestionRepository preguntaAutogestionRepository;

    public PreguntaAutogestionService(PreguntaAutogestionRepository preguntaAutogestionRepository) {
        this.preguntaAutogestionRepository = preguntaAutogestionRepository;
    }

    public List<PreguntaAutogestion> listByEstado(String estado) {
        return this.preguntaAutogestionRepository.findByEstado(estado);
    }

}
