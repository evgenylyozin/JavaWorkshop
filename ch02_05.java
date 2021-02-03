public class ch02_05 {
    public static void main (String[] args) {
        int age = 30;
        int bpm = 150;

        if (age == 30) {
            if((bpm >= 95) && (bpm <= 162)) {
                System.out.println("Пульс в норме");
            } else if (bpm < 95) {
                System.out.println("Пульс ниже нормы");
            } else {
                System.out.println("Пульс выше нормы");
            }
        } else if (age == 60) {
            if((bpm >= 80) && (bpm <= 136)) {
                System.out.println("Пульс в норме");
            } else if (bpm < 80) {
                System.out.println("Пульс ниже нормы");
            } else {
                System.out.println("Пульс выше нормы");
            }
        }
    }
}
