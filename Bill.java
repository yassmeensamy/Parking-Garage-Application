package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bill {
    public long calcFees(vehicle object) throws ParseException {

        long fees = 0;
        String startTime, endTime;
        startTime = object.getArrivalTime();
        endTime = object.getDepartureTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        long difference_In_Seconds = 0;
        try {
            Date d1 = sdf.parse(startTime);
            Date d2 = sdf.parse(endTime);


            long difference_In_Time
                    = d2.getTime() - d1.getTime();

            difference_In_Seconds
                    = (difference_In_Time
                    / 1000)
                    % 60;

            long difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;

            long difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;

            long difference_In_Years
                    = (difference_In_Time
                    / (1000l * 60 * 60 * 24 * 365));

            long difference_In_Days
                    = (difference_In_Time
                    / (1000 * 60 * 60 * 24))
                    % 365;

            System.out.print(
                    "Difference "
                            + "between two dates is: ");

            System.out.println(
                    difference_In_Years
                            + " years, "
                            + difference_In_Days
                            + " days, "
                            + difference_In_Hours
                            + " hours, "
                            + difference_In_Minutes
                            + " minutes, "
                            + difference_In_Seconds
                            + " seconds");
            fees = difference_In_Seconds * 5;
            return fees;
        }
        catch (ParseException e) {
            e.printStackTrace();
            return 0 ;
        }
    }
}
