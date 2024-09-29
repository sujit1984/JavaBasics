public class patternMatching {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "xy";
        String str3 = "abc6cdf";
        System.out.println(str1.matches(".")); //returns true since only one character is present

        System.out.println(str1.matches("[abc]")); //returns true since the character is among [abc]
        System.out.println(str1.matches("[xyz]"));  //returns false since the character is not [xyz]
        System.out.println(str2.matches("[xyz]"));  //returns false since str2 has 2 characters and not 1
        System.out.println(str1.matches("[^xyz]")); //returns true since str1 has a which is not in [xyz]
        System.out.println(str3.matches("[a-z]*"));  //returns false since there is a digit in the string
        String email = "programmer@gmail.com";
        int pos = email.indexOf('@');
        String username = email.substring(0,pos);
        System.out.println("Username is: "+ username);
        int len = email.length();
        String domain = email.substring(pos+1, len);
        System.out.println("Domain is: "+domain);

    }
}
