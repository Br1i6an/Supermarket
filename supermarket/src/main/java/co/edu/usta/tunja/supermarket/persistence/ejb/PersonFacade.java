/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.supermarket.persistence.ejb;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 0Anth
 */
@Stateless
public class PersonFacade extends Abstract<PersonEntity> {

    @PersistenceContext(unitName = "supermarketpu")
    private EntityManager _em;

    @Override
    protected EntityManager getAdmnEntity() {
        return this._em;
    }

    public PersonFacade() {
        super(PersonEntity.class);
    }

}
