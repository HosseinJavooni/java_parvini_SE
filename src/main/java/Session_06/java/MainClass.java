package Session_06.java;

public class MainClass {
    public static void main(String[] args){
        Person p1 = new Person("Amir", "Soltani");
        Person returnedPerson = OperationOnPerson(p1);
        System.out.println("firstName: " + returnedPerson.getFirstName() + " lastName: " + returnedPerson.getLastName());
    }
    public static Person OperationOnPerson(final Person person){
//        person = new Person("Kobra", "Savojbolaghi");
//        when use final method parameter then it can't be changed in method parameter
        person.setFirstName("Hossein");
        person.setLastName("Javooni");
        return person;
    }
}

class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}