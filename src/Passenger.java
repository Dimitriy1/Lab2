public class Passenger {
    private String name;
    private String surname;
    private int age;

    public Passenger(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + "name : " + name + " ,surname : " + surname + " ,age : " + age + "]";
    }
}