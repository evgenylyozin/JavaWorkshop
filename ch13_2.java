import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ch13_2 {
    public static void main(String[] args) {
        ShoppingCart myFirstCart = new ShoppingCart(new
ArrayList<ShoppingItem>());
        ShoppingCart mySecondCart = myFirstCart.addItem(new
ShoppingItem("Chair", 150));
        ShoppingCart myThirdCart = mySecondCart.addItem(new
ShoppingItem("Table",350));
    }

    public static final class ShoppingCart {
        public final List<ShoppingItem> mShoppingList;

        public ShoppingCart(List<ShoppingItem> list) {
            mShoppingList = Collections.unmodifiableList(list);
        }

        public ShoppingCart addItem(ShoppingItem item) {
            List<ShoppingItem> newList = new ArrayList<>(mShoppingList);
            newList.add(item);
            return new ShoppingCart(newList);
        }
    }

    private static final class ShoppingItem {
        private final String name;
        private final int price;

        public ShoppingItem(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }
}
