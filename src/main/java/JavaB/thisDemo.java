package JavaB;

/**
 * Created by Marius on 16-Jan-18.
 */
public class thisDemo {


    int a = 2;

    public void getData(){

        int a =3;
        int b =a+this.a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        //this refers to curent object - and the onject scope lies in class level

    }


    public static void main(String[] args) {

        thisDemo td = new thisDemo();
        td.getData();

    }
}
