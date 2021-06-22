/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.dto;

import it.sirfin.test.model.Animale;

/**
 *
 * @author 840-G1-008
 */
public class AnimaleDto {

    Animale animale;

    public AnimaleDto() {
    }

    public AnimaleDto(Animale animale) {
        this.animale = animale;
    }

    public Animale getAnimale() {
        return animale;
    }

    public void setAnimale(Animale animale) {
        this.animale = animale;
    }

    @Override
    public String toString() {
        return "AnimaleDto{" + "animale=" + animale + '}';
    }

}
