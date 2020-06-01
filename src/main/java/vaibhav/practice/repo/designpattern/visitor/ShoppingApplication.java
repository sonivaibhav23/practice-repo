package vaibhav.practice.repo.designpattern.visitor;

public class ShoppingApplication {

    public static void main(String[] args) {
        ShopItem[] items = new ShopItem[] {
                new BookShopItem("Abc", 30),
                new BookShopItem("Xyz", 60),
                new FruitShopItem(10, 5, "apple"),
                new FruitShopItem(40, 10, "mango")
        };

        int total = calculateTotalPrice(items);
        System.out.println(total);
    }

    private static int calculateTotalPrice(ShopItem[] items) {
        ShoppingCartVisitorImpl shoppingCartVisitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ShopItem item : items) {
            sum += item.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
