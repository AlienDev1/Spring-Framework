import CRUD.CreateDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 to add to the DB");
        System.out.println("2 to read the DB");
        System.out.println("3 to update the DB");
        System.out.println("4 to delete from the DB");
        System.out.println("5 to stop application");

        switch (choice){
            case 1:
                System.out.println("Creating 3 student objects...");
                System.out.println("Enter First Name: ");
                String name = sc.next();
                System.out.println("Enter Last Name: ");
                String lName = sc.next();
                System.out.println("Enter Company: ");
                String company = sc.next();
                CreateDB.create(name, lName, company);
                break;
        }
    }
}
