package Tiki;

public class Product {
    private String id;
    private String name;
// Contractor

    public Product(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public Product(){
      this.id="ID Product";
      this.name="name Product";

    }
// method
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
