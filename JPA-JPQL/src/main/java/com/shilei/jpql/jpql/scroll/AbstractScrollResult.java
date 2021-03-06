package com.shilei.jpql.jpql.scroll;

import org.hibernate.ScrollableResults;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;

import javax.persistence.EntityManager;

public abstract class AbstractScrollResult implements ScrollResult {
    protected ScrollableResults scrollableResults;
    protected Class resultClass;
    protected EntityManager entityManager;

    protected AbstractScrollResult(ScrollableResults scrollableResults, Class resultClass,EntityManager entityManager){
        this.scrollableResults=scrollableResults;
        this.resultClass=resultClass;
        this.entityManager=entityManager;
    }


    public boolean next(){
        return scrollableResults.next();
    }

    @Override
    public void close() {
        scrollableResults.close();
        //fix connection leak
        EntityManagerFactoryUtils.closeEntityManager(entityManager);
    }
}