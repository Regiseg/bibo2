package javanotes.chapter2;

public class ObjectCasting {

    public static void main(String[] args) {
        Float floatVar = new Float(42.0f);
        Number n = floatVar;                    //Implicit (Float implements Number)
        Float floatVar2 = (Float) n;            // Explicit
        Double doubleVar = (Double) n;          // Throws exception (the object is not Double
    }
}
