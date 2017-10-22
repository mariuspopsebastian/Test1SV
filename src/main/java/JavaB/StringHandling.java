package JavaB;

/**
 * Created by Marius on 22-Oct-17.
 */
public class StringHandling {
    public static void main(String[] args) {

        String str ="Payment $100 paid";
        System.out.println(str.charAt(8));

        //single purchase
        String str1 ="Payments $100 paid";
        System.out.println(str1.indexOf("$"));
        System.out.println(str.substring(8));



    }
}
