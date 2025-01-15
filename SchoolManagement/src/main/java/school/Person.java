package school;

public class Person {
    public String personName;
    protected int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public void displayPerson() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
    }
}
