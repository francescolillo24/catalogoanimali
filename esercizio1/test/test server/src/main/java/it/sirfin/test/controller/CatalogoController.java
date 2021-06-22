/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.controller;

import it.sirfin.test.dto.AnimaleDto;
import it.sirfin.test.dto.ListaAnimaliDto;
import it.sirfin.test.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 840-G1-008
 */
@RestController
@CrossOrigin("*")
public class CatalogoController {
    
     @Autowired
    CatalogoService catalogoService;
     
     @RequestMapping("aggiungi")
     @ResponseBody
     public ListaAnimaliDto aggiungi (@RequestBody AnimaleDto dto){
     return catalogoService.aggiungi(dto.getAnimale());
     }


}
