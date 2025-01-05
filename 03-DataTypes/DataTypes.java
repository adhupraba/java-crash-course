
class DataTypes {

    public static void main(String[] args) {
        // refer: https://www.ibm.com/docs/en/i/7.3?topic=programs-cobol-java-data-types

        // byte by = 128; // errors because `byte` range is 8 bits. -128 to 127.
        byte by = 127;

        // short sh = 32768; // errors because `short` range is 16 bits. -32768 to 32767
        short sh = 32767;

        // int i = 2147483648; // errors because `int` range is 32 bits. -2147483648 to 2147483647
        int i = 2147483647;

        long l = 4322l; // requires usage of `l` at the end of the number;

        // for floating point numbers, `double` is default because it has longer precision
        double num = 9.5;

        // float marks = 9.5; // error because default type for floating point is `double`.
        // use `f` at the end of the value (number) inorder to explicitly use `float`.
        float marks = 9.5f;

        // char d = 'as'; // char can take only single character. giving multiple characters will throw error
        char c = 'k'; // can use only single quotes for `char` data type
        char d = '1';

        String str = "asdasd";
        // String sd = 'asdfasdf'; // errors because `String` requires double quotes

        boolean ok = true;
        boolean notOk = false;
    }
}
