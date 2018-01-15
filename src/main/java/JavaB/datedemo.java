package JavaB;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Marius on 14-Nov-17.
 */
public class datedemo {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        System.out.println(d.toString());
        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));

        //mm/dd/yyyy HH:MM:SS
    }
}
