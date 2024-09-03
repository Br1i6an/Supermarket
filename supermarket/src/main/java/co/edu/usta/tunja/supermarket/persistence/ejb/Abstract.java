/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.supermarket.persistence.ejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author 0Anth
 */
public abstract class Abstract<T> {

    /*
    * General queries for any table. ADD, DELETE, UPDATE and LIST.
    * T -> This is a template. Like a parameter to one class
     */

    private final Class<T> entity;

    protected abstract EntityManager getAdmnEntity();

    public Abstract(Class<T> entity) {
        this.entity = entity;
    }

    //Save any entity in the database.
    public void record(T entity) {
        getAdmnEntity().persist(entity);
    }
    
    //Remove any entity from database.
    public void delete(T entity){
        getAdmnEntity().remove(entity);
    }
    
    //update entity.
    public void update(T entity){
        getAdmnEntity().merge(entity);
    }
    
    //search entity.
    public T search(Object idObject){
        return getAdmnEntity().find(entity, idObject);
        
    }

    //List all entity's information.
    public List<T> list() {
        
        //Condition criteriabuilder (create a query) SELECT
        CriteriaBuilder cb = getAdmnEntity().getCriteriaBuilder();
        
        //Do the query to the entity that was sended
        CriteriaQuery cq = cb.createQuery(entity);
        
        //For example on the from get ProductTypeEntity FROM
        cq.select(cq.from(entity));
        List<T> allData = getAdmnEntity().createQuery(cq).getResultList();
        
        return allData;
    }
    
    

}
