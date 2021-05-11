package prueba;

public class Trainer extends Human{

    public Trainer(String name) {
        super(name);
    }

    public void print(){
        System.out.println();
    }

    @Override
    public String toString() {
        return this.getName();
    }


}
