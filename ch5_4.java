public class ch5_4 {
    private static void staticMethod() {
        System.out.println("Static method called from null object");
    }
    private void nonStaticMethod() {
        System.out.println("inaccessible");
    }
    public static void main(String[] args) {

        ch5_4 object = null;

        object.staticMethod();
        object.nonStaticMethod();
        
    }
}
