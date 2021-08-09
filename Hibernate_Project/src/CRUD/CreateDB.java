package CRUD;


import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDB {

        public static void main(String[] args) {

            //create session factory
            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();

            //create a session
            Session session = factory.getCurrentSession();

            try{
                //create 3 student objects
                System.out.println("Creating 3 student objects...");
                Employee obj1 = new Employee( "Nyrobi", "Rhodes", "afroDevelopers@code.com");
                Employee obj2 = new Employee("Niginga", "Reeds", "afroDevelopers@code.com");
                Employee obj3 = new Employee("Nandi", "M-bacca", "afroDevelopers@code.com");

                //start a transaction
                session.beginTransaction();
                System.out.println("Beginning transaction...");

                //save the student object
//                session.save(obj1);
//                session.save(obj2);
//                session.save(obj3);
                System.out.println("Saving the new students...");

                //commit the transaction
                session.getTransaction().commit();
                System.out.println("Done!");

            } finally {
                factory.close();
            }
        }
}
