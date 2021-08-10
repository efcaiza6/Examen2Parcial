/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Embeddable
@Data
public class RespuestaAutogestionPK implements Serializable {

    @Column(name = "cod_pregunta", nullable = false)
    private int codPregunta;
    
    @Column(name = "cod_usuario", nullable = false, length = 30)
    private String codUsuario;

    
}
