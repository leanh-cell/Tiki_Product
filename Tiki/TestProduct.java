package Tiki;

public class TestProduct {
    public static void main(String[] args) {
        InforProduct p1 = new InforProduct("sp01","Iphone 7",10,"mobile",30000000);
        System.out.println(p1);
        System.out.println("id: "+p1.getId()
                +","+"name: "+p1.getName()
                +","+"Qty: "+p1.getQty()
                +","+"Category: "+p1.getCategory()
                +","+"Price: "+p1.getPrice());
        System.out.println("------------------");
        InforProduct p2 = new InforProduct("sp02","SamSung M1",20,"mobile",2000000);
        System.out.println(p2);
        System.out.println("id: "+p2.getId()
                +","+"name: "+p2.getName()
                +","+"Qty: "+p2.getQty()
                +","+"Category: "+p2.getCategory()
                +","+"Price: "+p2.getPrice());
        System.out.println("------------------");
        Product p3 = new Product();
        System.out.println(p3);
    }
}
