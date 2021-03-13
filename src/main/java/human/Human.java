package human;

import java.util.*;

public class Human implements Comparable<Human> {

    private String name;
    private Integer age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human o) {
        return age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Human bibi = new Human("Bibi", 47);
        Human lili = new Human("Lili", 16);

        System.out.println(bibi.compareTo(lili));

        List<Human> humans = new ArrayList<>(Arrays.asList(bibi, lili));
        System.out.println(humans.get(0));
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(humans.get(0));
        System.out.println(humans.get(1));

        System.out.println(Collections.binarySearch(humans, lili));


    }
}
