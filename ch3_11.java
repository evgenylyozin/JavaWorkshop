class Container {
    private class Continent {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    //метод для получения доступа к приватному внутреннему классу
    public void printContinent() {
        Continent continent = new Continent();
        continent.print();
    }
}
public class ch3_11 {
    public static void main(String[] args) {
        Container container = new Container();
        container.printContinent();
    }
}
