/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.service.impl;

import it.sirfin.test.dto.ListaAnimaliDto;
import it.sirfin.test.model.Animale;
import it.sirfin.test.repository.CatalogoRepository;
import it.sirfin.test.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 840-G1-008
 */
@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    CatalogoRepository catalogoRepository;

    @Override
    public ListaAnimaliDto aggiungi(Animale a) {
        a = catalogoRepository.save(a);
        return new ListaAnimaliDto(catalogoRepository.findAll());
    }

    @Override
    public ListaAnimaliDto elimina(Animale a) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
