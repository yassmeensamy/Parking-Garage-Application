package project;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class CalcTime {
    public String CurrentTime()
    {

        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss ");
        Date date = new Date(System.currentTimeMillis());
        //System.out.println(formatter.format(date));
        return formatter.format(date) ;
    }

}
