package DB;
import org.hibernate.*;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import javax.security.auth.login.Configuration;

/**
 * Created by IT_School on 21.12.2015.
 */
public class HibernateUtil {
    private static final org.hibernate.SessionFactory factory;
    static {
        try {
            factory = new org.hibernate.cfg.Configuration.configure();
            build SessionFactory();
        } catch (Throwable t) {
            System.out.println("unable to initialize connection");
            throw new ExceptionInInitializerError(t);
        }
    }
public static synchronized SessionFactory getFactory(){
    return factory;
}
}
