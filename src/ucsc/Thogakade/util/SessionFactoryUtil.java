/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsc.Thogakade.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Taniya
 */
public class SessionFactoryUtil {
    private static final SessionFactory sessionFactory;
    
    
    static {
        try {
                sessionFactory = new Configuration().configure("/ucsc/Thogakade/config/hibernate.cfg.xml").buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
        
    
    
    
}
