package generics;

public class Crate<T> {

    private T contents;

    public T looksIntoCrate(){
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }
}
