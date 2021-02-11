public class ch14_1 {
   public static void main(String[] args) {
       ch14_1 recursion = new ch14_1();
       System.out.println( recursion.add(1) );
   }
   public int add(int num) {
       if (num < 100) {
           return add(num+1);
       }
       return num;
   }
}
