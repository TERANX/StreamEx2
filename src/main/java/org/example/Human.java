package org.example;

public class Human {
    String name;
    int age;
    String prof;

    public Human(String name, int age, String prof) {
        this.name = name;
        this.age = age;
        this.prof = prof;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", prof='" + prof + '\'' +
                '}';
    }
}
