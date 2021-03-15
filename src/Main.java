import Factory.BananeCreator;
import Factory.SaltCreatorr;
import Product.Banane;
import Product.Product;

public class Main {
    public static void main(String[] args){
        // we use the banane factory which is still a Product
        Product b = new BananeCreator().createProduct();

        b.PrixTotal(4);

        b = new SaltCreatorr().createProduct();

        b.PrixTotal(10);

    }
}
