package vaibhav.practice.repo.designpattern.visitor;

public interface ShoppingCartVisitor {

    int visit(BookShopItem item);

    int visit(FruitShopItem item);
}
