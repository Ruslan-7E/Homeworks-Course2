package pro.sky.java.course2.hw8;

public class StringBuilderStuff {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("TPNIT");
        StringBuilder str2 = new StringBuilder(" - best ");
        StringBuilder str3 = new StringBuilder("college");
//        System.out.println(str1.charAt(3));
        str1.setCharAt(2, 'K');
        System.out.println(str1);

        str1.append(str2);
        str1.append(str3);
        str1.insert(str1.length(), " ever");
        System.out.println(str1);
    }
}
