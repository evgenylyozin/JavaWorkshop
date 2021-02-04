import java.util.logging.*;

public class ch5_8 {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            logger.log(Level.SEVERE, "Exception happened", e);
        }
    }
}