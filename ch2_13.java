public class ch2_13 {
    public static void main (String[] args) {

        String[] letters = {"A","B","C","D","E"};

        for (String letter : letters) {
            if (letter.equals("B")) {
                continue;
            }
            System.out.println(letter);
            if (letter.equals("D")) {
                break;
            }
        }
    }  
}
