package hikvision;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Larry 14/09/2017
 */
public class Bus {
    public static String INCORR = "incorrect data";
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
            String line = s.nextLine();
            String[] lines = line.split(",");
            int n = Integer.valueOf(lines[0]);
            String start = lines[1];
            String end = lines[2];
               Date startDate = sdf.parse(start);
                Date endDate = sdf.parse(end);

            if (n <= 2) {
                System.out.println(INCORR);
                continue;
            }
            long diff = getDiff(startDate, endDate);
            if (diff == -1) {
                System.out.println(INCORR);
                continue;
            }
            long q = diff/(n*15) + 1;
            long ramin = diff - (q-1)*(n*15);
            String fomat = "%d;%d-%d";
            if (ramin%15 == 0) {
                long x = ramin/15 +1;
                System.out.println(String.format(fomat, q, x, x));
            } else {
                long x = ramin/15 + 1;
                System.out.println(String.format(fomat, q, x, x+1));
            }

        }
    }
    public static long getDiff(Date start, Date end) {
        long diffSe = end.getTime()-start.getTime();
        if (diffSe%(60*1000) != 0) {
            return -1;
        }
        return diffSe/(60*1000);
    }
}
