package prueba;


import java.util.LinkedList;
import java.util.Queue;

public class Prueba {
    private int age = 40;

    public Prueba(int age) {
        age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    Prueba prueba = new Prueba(35);
        System.out.println(prueba.getAge());
    }
}
