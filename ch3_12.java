/**
 * <h1>Пример использования анонимного класса</h1>
 * в данном случае <b>переписывается</b> конкретный метод
 * существующего класса во время получения объекта
 * на основе этого класса.
 * 
 * @author Evgeny Lyozin
 * @version 0.1
 * @since 20210204
 */

class Container_2 {
    int c = 17;
    public void print() {
        System.out.println("This is an outer class");
    }
}

public class ch3_12 {
    public static void main(String[] args) {
    //inner class
    Container_2 container = new Container_2() {
        @Override
        public void print() {
            System.out.println("This is an inner class");
        }
    };

    container.print();
    System.out.println(container.c);

    }
}
