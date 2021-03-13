package prueba;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayDeque;
import java.util.LinkedList;

import java.util.List;
import java.util.Queue;

public class Prueba {

    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();

        names.add("Hello");
        names.add("Bibo");
        names.add("Tiva");

        System.out.println(names.element());

        System.out.println("Prueba");
    }
}
