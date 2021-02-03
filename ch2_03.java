public class ch2_03 {
    public static void main (String[] args) {
        int speed = 75;
        int maxSpeed = 60;
        int speedForFine = 70;

        if (speed > maxSpeed) {
            System.out.println("Скоростной лимит превышен!");
            
            if(speed>=speedForFine){
                System.out.println("Вам выписан штраф!");
            }
        }
    }
}
