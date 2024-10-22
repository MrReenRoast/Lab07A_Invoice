import java.util.ArrayList;

public class Invoice {
    private ArrayList<LineItem> items;

    public Invoice() {
        items = new ArrayList<>();
    }

    public void addItem(LineItem item) {
        items.add(item);
    }

    public double getTotalAmount() {
        double total = 0;
        for (LineItem item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public String getInvoiceDetails() {
        StringBuilder details = new StringBuilder();
        for (LineItem item : items) {
            details.append(item.getDetails()).append("\n");
        }
        details.append("Total Amount Due: ").append(getTotalAmount());
        return details.toString();
    }
}