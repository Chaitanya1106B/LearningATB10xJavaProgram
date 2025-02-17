package ex_15_Strings_Functions;

public class Lab_141_Strings_Functions {
    public static void main(String[] args) {
        String name = "Chaitanya";
        System.out.println(name.length());
        // 1. charAt()
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(9)); -- String index out of bound exception

        // 2. concat()
        System.out.println(name.concat(" Chaitu")); // adding

        // 3. contains()
        System.out.println(name.contains("Ch"));  // boolean

        // 4. equals()
        System.out.println(name.equals("Chai")); // boolean

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("chaitanya"));

        // 6. indexOf() //  chaitanya -> ? h
        System.out.println(name.indexOf('h'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 9. split()
        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 5));
        String ss = "hamburger";
        System.out.println(ss.substring(4,9));

        // 11. toLowerCase()
        System.out.println("CHAITANYA".toLowerCase());

        // 12. toUpperCase()
        System.out.println("chaitanya".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("C"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Chaitanya Bh     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Chaitanya"));  // case sensitive


        // 18. compareToIgnoreCase()
        //System.out.println(name.compareToIgnoreCase("chaitanya"));

        StringBuilder stringBuilder = new StringBuilder("Chaitanya");
        stringBuilder.append("Bh");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());
    }
}
