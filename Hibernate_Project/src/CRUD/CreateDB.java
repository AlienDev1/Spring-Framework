package CRUD;


import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDB {

        public static void create(String fName, String lName, String company) {


            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();

            Session session = factory.getCurrentSession();

            try{

                Employee obj1 = new Employee( fName, lName, company);

                session.beginTransaction();
                System.out.println("Beginning transaction...");


//                session.save(obj1); <- This is where my application is throwing the error org.hibernate.exception.GenericJDBCException: could not execute statement
                // When commented out the application runs successfully however data is not add to the DB
                
                System.out.println("Saving the new object...");

                session.getTransaction().commit();
                System.out.println("Done!");

            } finally {
                factory.close();
            }
        }
}
