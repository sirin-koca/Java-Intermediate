package java_features;

/* JNDI is a Java API that allows applications to discover and look up data and objects via a name,
like accessing database connections by name in a Java EE environment or looking up remote objects in
 a distributed computing environment. A JndiLookup would likely be a class or utility that facilitates the process
 of querying or interacting with a naming and directory service using JNDI.
*/

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class JndiLookup {
    public static void main(String[] args) {
        Hashtable<String, String> env = new Hashtable<>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put(Context.PROVIDER_URL, "rmi://localhost:1099");

        try {
            InitialContext context = new InitialContext(env);
            // Your lookup and operations go here.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
