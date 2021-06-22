/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author 840-G1-008
 */
@Entity
public class Animale implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nome;
    @Column
    private String razza;
    @Column
    private String specie;
    @Column
    private String gabbia;

    public Animale() {
    }

    public Animale(String nome, String razza, String specie, String gabbia) {
        this.nome = nome;
        this.razza = razza;
        this.specie = specie;
        this.gabbia = gabbia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getGabbia() {
        return gabbia;
    }

    public void setGabbia(String gabbia) {
        this.gabbia = gabbia;
    }

    @Override
    public String toString() {
        return "Animale{" + "id=" + id + ", nome=" + nome + ", razza=" + razza + ", specie=" + specie + ", gabbia=" + gabbia + '}';
    }

}
