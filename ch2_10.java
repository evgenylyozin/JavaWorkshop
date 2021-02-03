public class ch2_10 {
    public static void main (String[] args) {

        int season = 3;
        String message = switch(season) {
            case 1->"Весна";
            case 2->"Лето";
            case 3->"Осень";
            case 4->"Зима";
            default->"Не сезон";
        };

        System.out.println(message);
        

    } 
}
