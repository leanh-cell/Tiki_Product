package Tiki;

public class InforProduct extends Product {
    private int qty;
    private String category;
    private int price;
    public InforProduct() {
        super();
     this.qty=qty;
     this.category=category;
     this.price=price;
    }
    public InforProduct(String id, String name,int qty,String category,int price){
        super();
        this.qty=qty;
        this.category=category;
        this.price=price;
   }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InforProduct{" +
                "Product"+super.toString()+'\''+
                "qty='" + qty + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
