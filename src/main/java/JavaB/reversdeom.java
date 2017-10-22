package JavaB;

/**
 * Created by Marius on 22-Oct-17.
 */
public class reversdeom {
    public static void main(String[] args) {
        String s="Marius";
        //suiram
        String  s1 = "madam";
        String t ="";
        for (int i=s1.length()-1; i>=0; i--){

            t= t + s1.charAt(i);
        }
        System.out.println(t);

        if(s==t){
            System.out.println("if is palindrome");
        }
    }
}
