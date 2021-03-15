package Product;

public class Banane extends Product{

    @Override
    public int productPrice() {
        return 2000;
    }

    @Override
    public void PrixTotal(int number) {
        int total = productPrice() * number;
        System.out.println("THE TOTAL PRICE OF THE BANANA IS $"+total);
    }
}
