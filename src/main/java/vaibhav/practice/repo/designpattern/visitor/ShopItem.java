package vaibhav.practice.repo.designpattern.visitor;

public interface ShopItem {

    int accept(ShoppingCartVisitor visitor);
}
