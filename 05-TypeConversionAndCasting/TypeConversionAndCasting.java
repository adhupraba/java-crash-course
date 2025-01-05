
class TypeConversionAndCasting {

    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        int c = 290;

        // type conversion
        a = b; // works because int can accomodate the size of byte range
        // b = a; // doesn't work because byte can't accomodate the size of int

        // type casting
        b = (byte) a;
        System.out.println("b after assiging a => " + b);

        b = (byte) c;
        System.out.println("b after assiging c => " + b);

        float f = 5.6f;
        int x = (int) f; // converts the floating point to whole number

        byte a1 = 10;
        byte a2 = 30;

        // `type promotion` -> a1 * a2 is out of range for byte. so byte is promoted to int
        int result = a1 * a2;

        System.out.println("byte * byte when out of range gives int => " + result);
    }
}
