package vaibhav.practice.repo.designpattern.visitor;

public class BookShopItem implements ShopItem {

    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public BookShopItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
