
class StringBufferAndBuilder {

    public static void main(String[] args) {
        // StringBuffer and StringBuilder are almost identical
        // StringBuffer is thread safe; StringBuilder is not thread safe

        StringBuffer sb = new StringBuffer("Alex");
        System.out.println(sb.capacity());

        sb.append(" Adams");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.insert(0, "Java ");
        System.out.println(sb);

    }
}
