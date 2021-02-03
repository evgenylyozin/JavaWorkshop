public class ch2_02 {
    public static void main (String[] args) {
       int max = 10;
       int home = 11;

       if (home > max) {
        System.out.println("Расстояние равно " + home + "км, слишком далеко для доставки.");
       }
       if (home <= max) {
        System.out.println("Доставка займет 1 час.");
       }
    }
}
