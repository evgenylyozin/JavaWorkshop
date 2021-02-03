public class ch2_9 {
    public static void main (String[] args) {

        String cat = new String("cat");
        String dog = new String("dog");

        if (cat.equals(dog)) {
            System.out.println("Кошки и собаки одинаковые");
        }

        if (!cat.equals(dog)) {
            System.out.println("Кошки и собаки не одинаковые");
        }
        
        if (dog.equals(dog)) {
            System.out.println("Собака - это собака");
        }

        if (dog.equals("dog")) {
            System.out.println("Собака - это собака");
        }

        if ("dog".equals(dog)) {
            System.out.println("Собака - это собака");
        }

    } 
}
