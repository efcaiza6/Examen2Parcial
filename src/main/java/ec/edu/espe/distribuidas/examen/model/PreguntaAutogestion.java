/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Entity
@Table(name = "seg_pregunta_autogestion")
@Data

public class PreguntaAutogestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_pregunta", nullable = false)
    private Integer codPregunta;
    
    @Column(name = "enunciado", length = 100)
    private String enunciado;
    
    @Column(name = "estado", length = 3)
    private String estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preguntaAutogestion")
    private List<RespuestaAutogestion> respuestaAutogestion;

    
}
