

public class ch3_4 {

    public static void checkNumber(Number val) {
        if (val instanceof Integer) {
            System.out.println("Значение типа Integer"); 
        }
        if (val instanceof Double) {
            System.out.println("Значение типа Double"); 
        }
    }
    public static void main(String[] args) {
        int val1 = 1;
        double val2 = 1.5;
        checkNumber(val1);
        checkNumber(val2);
    }
}
