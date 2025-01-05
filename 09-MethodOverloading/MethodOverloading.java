
class MethodOverloading {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int r1 = calculator.add(3, 2);
        int r2 = calculator.add(3, 2, 1);
        double r3 = calculator.add(3.5, 2);

        System.out.println("r1 => " + r1);
        System.out.println("r2 => " + r2);
        System.out.println("r3 => " + r3);
    }
}

class Calculator {

    int num;

    public int add(int n1, int n2) {
        System.out.println("num val => " + num); // prints 0
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}
