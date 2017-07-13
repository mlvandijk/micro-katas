package streams;

public class Person{
    String name;
    int age;
    String nationality;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String nationality) {
        this(name, age);
        this.nationality = nationality;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

}
