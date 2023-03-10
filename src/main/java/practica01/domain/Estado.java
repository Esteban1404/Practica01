/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author esteb
 */
@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;  //Hibernate lo transforma en id_cliente
    private String pais;
    private String capital;
    private String idioma;
    private String superficie;

    public Estado() {

    }

    public Estado(String pais, String capital, String idioma, String superficie) {

        this.pais = pais;
        this.capital = capital;
        this.idioma = idioma;
        this.superficie = superficie;
    }

}
