package javaprimerclass.person;

public class appPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Fuad", "Al kwkabani", "12345678", 1994, "Yemwn", 'M');
        Person person2 = new Person("Sandra", "Smith", "87654321", 1990, "Spain", 'F');

        
        System.out.println("Person 1 Details:");
        person1.printDetails();
        System.out.println("\nPerson 2 Details:");
        person2.printDetails();
    }

}
