package com.adhvay;


import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/* An app interacts with JDO using an instance of the PersistenceManager class. 
You get this instance by instantiating and calling a method on an instance 
of the PersistenceManagerFactory class */

public final class PMF {

    private static final PersistenceManagerFactory pmfInstance = JDOHelper
            .getPersistenceManagerFactory("transactions-optional");

    private PMF() {
    }

    public static PersistenceManagerFactory get() {

        return pmfInstance;
    }

}
