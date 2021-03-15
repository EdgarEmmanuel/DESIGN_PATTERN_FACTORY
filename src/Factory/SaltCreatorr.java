package Factory;

import Product.Product;
import Product.Salt;

public class SaltCreatorr implements CreatorProduct{
    @Override
    public Product createProduct() {
        return new Salt();
    }
}
