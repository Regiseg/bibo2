package prueba;

public class Trainer implements Comparable<Trainer>{

    private Integer id;

    private String name;

    @Override
    public int compareTo(Trainer other) {
        return id.compareTo(other.id);
    }
}
