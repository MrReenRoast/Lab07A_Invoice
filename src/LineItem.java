public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return quantity * product.getUnitPrice();
    }

    public String getDetails() {
        return quantity + " x " + product.getName() + " @ " + product.getUnitPrice() + " = " + getTotal();
    }
}