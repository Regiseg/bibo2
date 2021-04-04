package javanotes.chapter2;

public class ExcplicitCasting {

    public static void main(String[] args) {
        double doubleVar = 42.0;
        float floatVar = (float) doubleVar;
        int intVar = (int) floatVar;
        short shortVar = (short) intVar;
        byte byteVar = (byte) shortVar;

        double minusDoubleVar = -45.6785;
        int minusIntVar = (int) minusDoubleVar;
        System.out.println(minusIntVar);
    }
}
