
class ClassAndObject {

    public static void main(String[] args) {
        int num1 = 4, num2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);

        System.out.println("result => " + result);
    }
}

class Calculator {

    int a, b;

    public int add(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }
}
