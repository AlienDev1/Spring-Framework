package CRUD;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ReadDB {

    public void readAll(){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();

            // Creates SQL statement that select * from employees
            List<Employee> list = session.createQuery("from Employee").getResultList();
            showEmployeeList(list);

            session.getTransaction().commit();
            System.out.println("Finished!");
        } finally {
            factory.close();
        }
    }

    public void readById(int id){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();

            List<Employee> list = session.createQuery(String.format("from Employee e where id= %s", String.valueOf(id))).getResultList();
            showEmployeeList(list);
            session.getTransaction();

        }finally {
            factory.close();
        }
    }

    // for each loop to show list
    public void showEmployeeList(List<Employee> list){
        for(Employee element : list){
            System.out.println(element);
        }
    }
}
