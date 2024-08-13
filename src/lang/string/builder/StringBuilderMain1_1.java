package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        System.out.println("sb = " + sb);

        sb.insert(5, "java");
        System.out.println("sb = " + sb);

        sb.delete(7,9);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        //StringBuilder -> String
        String str = sb.toString();
        System.out.println("str = " + str);

    }
}