/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Entity
@Data
@Table(name = "seg_respuesta_autogestion", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"cod_pregunta", "cod_usuario"})})

public class RespuestaAutogestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RespuestaAutogestionPK respuestaAutogestionPK;
    @Column(name = "respuesta", length = 100)
    private String respuesta;
    @JoinColumn(name = "cod_pregunta", referencedColumnName = "cod_pregunta", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PreguntaAutogestion preguntaAutogestion;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

}
