package JavaB;

/**
 * Created by Marius on 16-Jan-18.
 */
public class childDemo extends  parentdemo {

    //String name = "QA Ceva";


    public childDemo(){
        super(); //it should always be the first line in thechild constructor
        System.out.println("child class constructor");
    }
    public void getStringdata(){

        System.out.println(name);
        System.out.println(super.name);

    }

    public void getData(){
        super.getData();
        System.out.println("I am child class");
    }

    public static void main(String[] args) {

        childDemo cd = new childDemo();
        cd.getStringdata();
        cd.getData();

    }
}
