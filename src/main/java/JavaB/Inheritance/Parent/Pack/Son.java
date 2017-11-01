package JavaB.Inheritance.Parent.Pack;

/**
 * Created by Marius on 01-Nov-17.
 */
public class Son extends Grandfather {
    public static void main(String[] args) {

        Son s = new Son();
        s.city();
        s.country();
        System.out.println(s.i);



}
    public void sonactivites()
    {
        System.out.println("activites");
    }
}
