package prueba;


public class Prueba {


    public static void main(String[] args) {

        Human human = new Trainer("bibi");

        human = new Human("Bibó");

        Trainer trainer = (Trainer) new Human("bib");

       // System.out.println(trainer.getAge());
    }
}
