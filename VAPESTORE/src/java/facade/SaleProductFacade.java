/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.SaleProduct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brad_
 */
@Stateless
public class SaleProductFacade extends AbstractFacade<SaleProduct> {

    @PersistenceContext(unitName = "VAPESTOREPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SaleProductFacade() {
        super(SaleProduct.class);
    }
    
}
