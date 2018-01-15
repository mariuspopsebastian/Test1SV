package JavaB;

/**
 * Created by Marius on 15-Jan-18.
 */
public class constructDemo {

    public constructDemo(){
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");

    }
    //Parameterized constructor


    /*public constructDemo(int a, int b){
        System.out.println("I am in the PARAMETERIZED constructor");
    }*/

    public constructDemo(String str){
        System.out.println("I am a from the String");
    }

    public constructDemo(int c, int d){
        int e = c + d;
        System.out.println(e);

    }

    public void getdata(){
        System.out.println("I am the method");
    }




    public static void main(String[] args) {

        constructDemo cd = new constructDemo();
        constructDemo cd2 = new constructDemo(4, 5);
        constructDemo cd3= new constructDemo("helo");
        //when ever you create an object contructor is called
        //compiler will call implict constructor if you have not defin



        //construcotr not return values
        //name of constructor should be the class name

        //block of code is executed when an object is created
    }
}
