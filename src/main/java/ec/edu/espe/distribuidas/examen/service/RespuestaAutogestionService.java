/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.service;

import ec.edu.espe.distribuidas.examen.dao.RespuestaAutogestionRepository;
import ec.edu.espe.distribuidas.examen.model.PreguntaAutogestion;
import ec.edu.espe.distribuidas.examen.model.RespuestaAutogestion;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows Boo
 */
@Service
public class RespuestaAutogestionService {

    private final RespuestaAutogestionRepository respuestaAutogestionRepository;

    public RespuestaAutogestionService(RespuestaAutogestionRepository respuestaAutogestionRepository) {
        this.respuestaAutogestionRepository = respuestaAutogestionRepository;
    }

    @Transactional
    public void createRespuestasPreguntas(RespuestaAutogestion respuestaAutogestion, PreguntaAutogestion preguntaAutogestion) {
        
    }

}
