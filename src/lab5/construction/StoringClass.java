

package lab5.construction;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;

public class StoringClass {

public class StoreData {  
	public static void MyFunction(String[] args) {  
		//creating configuration object  
		Configuration cfg=new Configuration();  
		cfg.configure("PersistentClass.cfg.xml");//populates the data of the configuration file  
		//creating seession factory object  
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()). build();
		SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);
		//creating session object  
		Session session=factory.openSession();  
			//creating transaction object  
			Transaction t=session.beginTransaction();  
			PersistentClass myPersistentClass=new PersistentClass();  
			myPersistentClass.setId(115);  
			myPersistentClass.setCountry("Fahad");  
			myPersistentClass.setRegion("Satti"); 
                        myPersistentClass.setSalary("Satti"); 
                        myPersistentClass.setPostalCode("Satti"); 
                        myPersistentClass.setLatitude("Satti"); 
                        myPersistentClass.setLongitude("Satti"); 
                        myPersistentClass.setAreaCode("Satti"); 
                        myPersistentClass.setMetroCode("Satti"); 
			session.persist(myPersistentClass);//persisting the object  
			t.commit();//transaction is commited  
		session.close();  
	}  
} 

    
}
