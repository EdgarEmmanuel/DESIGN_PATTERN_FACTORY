package Factory;

import Product.Product;
import Product.Banane;

public class BananeCreator implements CreatorProduct{
    @Override
    public Product createProduct() {
        return new Banane();
    }
}
