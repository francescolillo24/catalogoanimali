/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.test.repository;

import it.sirfin.test.model.Animale;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 840-G1-008
 */
@Repository
public interface CatalogoRepository extends JpaRepository<Animale, Long> {

}
