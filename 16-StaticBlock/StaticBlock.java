
public class StaticBlock {

    public static void main(String[] args) {
        // ! class is loaded into memory only when it is being used
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
    }
}

class Mobile {

    String brand;
    int price;
    static String type;

    static {
        type = "Phone";
        System.out.println("inside static block");
    }

    public Mobile() {
        brand = "";
        price = 1000;
        System.out.println("inside constructor");
    }

    // can use static varaibles inside non-static methods
    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }

    // cannot use instance variables inside static method
    public static void show1(Mobile obj) {
        // System.out.println(brand + " : " + price + " : " + type);
        System.out.println("Static show --> " + obj.brand + " : " + obj.price + " : " + type);
    }
}
