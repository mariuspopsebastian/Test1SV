package ForInterv;

/**
 * Created by Marius on 23-Oct-17.
 */
public class For
{
    public static void main(String[] args) {
        int age =10;

        //if statement

        if (age<10){
            System.out.println("varsta sub 10");
        }
        else{
            System.out.println("varsta peste 10");
        }

        //nested if statement

        if (age>3){
            if (age>5){
                System.out.println("prima varianta");
            }else {
                System.out.println("a doua varianta");
            }
        }else {
            System.out.println("zi altceva");
        }
        ////else if statement

        if (age<=0){
            System.out.println("error");
        }else if (age<3){
            System.out.println("too yung");
        }else if (age<6){
            System.out.println("inca nu ok");
        }else if (age<=10){
            System.out.println("Else if varianta 3");
        }

    }
}
