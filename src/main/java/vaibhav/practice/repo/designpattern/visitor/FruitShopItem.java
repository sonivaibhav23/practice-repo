package vaibhav.practice.repo.designpattern.visitor;

public class FruitShopItem implements ShopItem {

    private int price;
    private int weight;
    private String name;

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public FruitShopItem(int price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
