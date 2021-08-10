/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Entity
@Table(name = "seg_usuario")
@Data

public class Usuario implements Serializable {

    @Id
    @Column(name = "cod_usuario", nullable = false, length = 30)
    private String codUsuario;
    
    @Column(name = "nombre", length = 150)
    private String nombre;
    
    @Column(name = "identificacion", length = 30)
    private String identificacion;
    
    @Column(name = "email", length = 250)
    private String email;
    
    @Column(name = "estado", length = 3)
    private String estado;
    
    @Column(name = "nro_intentos_fallidos")
    private Integer nroIntentosFallidos;
    
    @Column(name = "fecha_ultima_sesion")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaSesion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<RespuestaAutogestion> respuestaAutogestion;

}
