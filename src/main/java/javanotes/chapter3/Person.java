package javanotes.chapter3;

import java.util.Objects;

public class Person {
    private String name = "bibi";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    static void print(){
        StringBuilder sb = new StringBuilder("helo");
    }

    public static void main(String[] args) {

        System.out.printf("%8.2f", 1000.0/3.0);

    }
}
