/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.dto;

import it.sirfin.test.model.Animale;
import java.util.List;

/**
 *
 * @author 840-G1-008
 */
public class ListaAnimaliDto {

    List<Animale> listaAnimali;

    public ListaAnimaliDto(List<Animale> listaAnimali) {
        this.listaAnimali = listaAnimali;
    }

    public List<Animale> getListaAnimali() {
        return listaAnimali;
    }

    public void setListaAnimali(List<Animale> listaAnimali) {
        this.listaAnimali = listaAnimali;
    }

    @Override
    public String toString() {
        return "ListaAnimaliDto{" + "listaAnimali=" + listaAnimali + '}';
    }

}
