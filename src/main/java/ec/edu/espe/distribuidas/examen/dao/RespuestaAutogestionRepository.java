/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.dao;

import ec.edu.espe.distribuidas.examen.model.RespuestaAutogestionPK;
import ec.edu.espe.distribuidas.examen.model.RespuestaAutogestion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Windows Boo
 */
public interface RespuestaAutogestionRepository extends JpaRepository<RespuestaAutogestion, RespuestaAutogestionPK>{
    
}
