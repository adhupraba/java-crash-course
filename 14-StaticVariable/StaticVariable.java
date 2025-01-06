
class StaticVariable {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // static variables can be called using the reference variable `obj1`, `obj2`
        // but use the class name `Mobile` itself.
        // It is the preferred way of accessing static variables
        // obj1.type = "SmartPhone";
        Mobile.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.type = "SmartPhone";

        obj1.show();
        obj2.show();

        System.out.println("updating Mobile type");
        // obj1.type = "Phone";
        Mobile.type = "Phone";

        obj1.show();
        obj2.show();
    }
}

class Mobile {

    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}
