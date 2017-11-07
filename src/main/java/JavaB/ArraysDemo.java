package JavaB;

/**
 * Created by Marius on 07-Nov-17.
 */
public class ArraysDemo {
    public static void main(String[] args) {

        int a[] = new int[5]; //Declares an aray and allocates memory for the values
        a[0]=2;
        a[1]=6;
        a[2]=1;
        a[3]=9;
        a[4]=12;

        int b[] ={1, 4, 4, 5, 7};
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }


    }
}
