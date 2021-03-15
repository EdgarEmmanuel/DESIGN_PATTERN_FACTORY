package Product;

public class Salt extends Product{

    @Override
    public int productPrice() {
        return 800;
    }

    @Override
    public void PrixTotal(int kgs) {
        System.out.println("THE FINAL OF THE SALT PRICE IS $"+productPrice()*kgs);
    }
}
