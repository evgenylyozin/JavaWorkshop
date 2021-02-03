public class ch2_8 {
    public static void main (String[] args) {

        int season = 3;
        String message;

        switch(season) {
            case 1: message = "Весна";
                break;
            case 2: message = "Лето";
                break;
            case 3: message = "Осень";
                break;
            case 4: message = "Зима";
                break;
            default: message = "Не сезон";
                break;

        }

        System.out.println(message);
        

    } 
}
