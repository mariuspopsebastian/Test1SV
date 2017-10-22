package JavaB;

/**
 * Created by Marius on 22-Oct-17.
 */
public class Exer2Forloop {
    public static void main(String[] args) {
        int sum = 0;
        int c[] = {2, 5, 8, 7, 4, 6, 3};
        for (int i = 0; i < c.length; i++)//7times
        {
            System.out.println(c[i]);
            if (c[i]==7)
                {

                break;
                }
        }

    }
}
