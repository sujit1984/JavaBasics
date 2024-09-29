public class stringObjects {

    public static void main(String[] args) {


        char c[] = {'A', 'B','C','D'};
        String str1 = new String(c);

        byte b[] = {65,66,67,68};
        String str2 = new String(b);
        System.out.println("Character Array "+str1);  //output is ABCD
        System.out.println("Byte Array "+str2); //outputs ABCD

        String str4="Java Program";
        String str5="Java Pgm";

        String str6 = str4.toLowerCase();
        String str7 = str5.toUpperCase();
        System.out.println(str6);
        System.out.println(str7);

        String str8 = "   welcome   ";
        String str9 = str8.trim();

        System.out.println(str9);
        String str10 = "welcome";

        String str11 = str10.substring(3);
        System.out.println(str11);
        String str12 = str10.substring(3,6);

        //replace example to show how we can use the replace option to replace a character or a substring in a string with another character or substrin
        System.out.println(str12);
        String str13 = str10.replace('e','u');
        System.out.println(str13);

        //startsWith example
        String str14 = "www.abcde.org";
        boolean website = str14.startsWith("www");
        System.out.println(website);


        //endsWith example
        boolean org = str14.endsWith(".org");
        String str15 = org == true ? "It's an organization": "It's not an organization";
        System.out.println(str15);



    }
}
