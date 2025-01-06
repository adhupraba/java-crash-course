
class StaticMethod {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        System.out.println("updating Mobile type");
        Mobile.type = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}

class Mobile {

    String brand;
    int price;
    static String type;

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
