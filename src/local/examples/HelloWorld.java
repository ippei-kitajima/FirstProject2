
package local.examples;

public class HelloWorld {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b);
        System.out.println(sb.toString());

    }
}
