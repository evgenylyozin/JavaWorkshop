class Age {
    public double a = 0;

    Age (double _a) {
        a = _a;
    }
    Age (int year, int month) {
        a = year + (double) month / 12;
    }

    public void setAge( double _a ) {
        a = _a;
    }
    public void setAge( int year, int month ) {
        a = year + (double) month / 12;
    }
    public double getAge(){
        return a;
    }
    
 }
 
 
 public class ch3_9 {
     public static void main(String[] args) {
         Age age1 = new Age(12.5);
         Age age2 = new Age(9,3);
         System.out.println(age1.getAge());
         System.out.println(age2.getAge());
     }
 }
 