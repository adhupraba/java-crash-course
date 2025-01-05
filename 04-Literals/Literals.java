
class Literals {

    public static void main(String[] args) {
        // bits representation; 101 -> 5
        int num1 = 0b101;
        System.out.println("bits representation => " + num1);

        // hexadecimal representation
        int num2 = 0x7E;
        System.out.println("hexadecimal representation => " + num2);

        int huge = 10_00_00_000;
        System.out.println("huge number => " + huge);

        double d1 = 56;
        System.out.println("double value => " + d1);

        double d2 = 12e10;
        System.out.println("double huge value => " + d2);

        char c = 'a';
        System.out.println("char value => " + c);
        c += 1;
        System.out.println("char incremented value => " + c);
    }
}
