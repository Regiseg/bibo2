package prueba;

public class Prueba {


    public static void main(String[] args) {

        Animal sheep = new Sheep();

        Sheep cat = (Sheep) sheep;

        cat.talk();


    }
}
