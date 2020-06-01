package vaibhav.practice.repo.designpattern.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {


    @Override
    public int visit(BookShopItem item) {
        return item.getCost();
    }

    @Override
    public int visit(FruitShopItem item) {
        return item.getPrice() * item.getWeight();
    }
}
