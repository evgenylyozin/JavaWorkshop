public class ch02_04 {
    public static void main (String[] args) {
        int noDiscount = 0;
        int mediumDiscount = 10;
        int largeDiscount = 15;

        int mediumThreshold = 5;
        int largeThreshold = 50;

        int purchadeAmmount = 40;

        if (purchadeAmmount>=largeThreshold) {
            System.out.println("Вам положена скидка "+largeDiscount+"%");
        } else if (purchadeAmmount>=mediumThreshold) {
            System.out.println("Вам положена скидка "+mediumDiscount+"%");
        } else {
            System.out.println("Вам не положена скидка");
        }
    }
}
