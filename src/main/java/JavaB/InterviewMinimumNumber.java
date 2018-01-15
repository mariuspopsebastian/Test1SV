package JavaB;

/**
 * Created by Marius on 08-Nov-17.
 */
public class InterviewMinimumNumber {
    public static void main(String[] args) {
        int abc[][]= {{2,4,5},{3,2,10},{1,2,0}};
        int min=abc[0][0];
        int max=abc[0][0];
        int mincolumn=0;
//minimum number print
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (abc[i][j]<min)
                {
                    min=abc[i][j];
                }
            }
        }
        System.out.println(min);


//maximum number print

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (abc[i][j]>max)
                {
                    max=abc[i][j];
                }
            }
        }
        System.out.println(max);
//print maximmum number for the collon that has the minimum number


        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (abc[i][j]<min)
                {
                    min=abc[i][j];
                    mincolumn=j;
                }

            }
        }
        int max2=abc[0][mincolumn];
        int k = 0;
        while (k<3 )
        {
            if (abc[k][mincolumn]>max2)
            {
                max2=abc[k][mincolumn];
            }
            k++;
        }
        System.out.println(max2);
    }
}
