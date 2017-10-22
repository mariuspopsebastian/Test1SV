package JavaB;

/**
 * Created by Marius on 22-Oct-17.
 */
public class Exer1Forloop {
    public static void main(String[] args) {
        int sum=0;
        int c[] ={2,5,8,7,4};
        for (int i=0; i<c.length; i++)//5times
        {
            //System.out.println(c[i]);
            sum=sum+c[i];
            //first time in the loop 0=2; sum=2
            //second time in the loop 2+5 sum=7
            //third time in the loop 7+8 sum=15
            // forth timed in the loop 15+7 sum=22
            //fifth time the loop goes 22+4 sum =26
        }
        System.out.println(sum);
    }
}
