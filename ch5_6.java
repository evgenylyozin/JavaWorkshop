public class ch5_6 {
    public static void main(String[] args) {
        
       String text = null;

       System.out.println("Go Java Go!");

       try {

        System.out.println(text.length());

       } catch (NullPointerException e) {

        System.out.println("Exception cought: null String, can't get its length");

       }  
   
    }
}