public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ezzah");
        sb.append(" Ansari");
        System.out.println(sb);
        System.out.println(sb.delete(0,5));
        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.length());
        System.out.println(sb.substring(3));
        System.out.println(sb.capacity());
        System.out.println(sb.substring(1,3));
        System.out.println(sb.replace(1,6,"Ezzah"));
        System.out.println(sb.indexOf("Ezzah"));
    }
}
