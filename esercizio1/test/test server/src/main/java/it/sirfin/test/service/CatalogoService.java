/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.service;

import it.sirfin.test.dto.ListaAnimaliDto;
import it.sirfin.test.model.Animale;

/**
 *
 * @author 840-G1-008
 */
public interface CatalogoService {
    
    ListaAnimaliDto aggiungi(Animale a);

	ListaAnimaliDto elimina(Animale a);
    
}
