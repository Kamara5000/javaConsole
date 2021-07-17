import java.util.Date;
import java.text.*;

public class Timeclass {

    public void mydates(){ //For dates
        Date mydate = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-E 'in' hh-mm");
        // System.out.println(mydate.getDate());
        System.out.println(sd.format(mydate));
    }
    
    public static void main(String[] args) {
         Timeclass tc = new Timeclass();
         tc.mydates();
    }
}

// G stands for era like AD e.tc
// yy writes the year in full
//MM month of the year
// d day of the month (in int);
// D returns day of the year
// h refers to  hours in 12hour format
// H refers to  hours in 24hour format
// m minute in init
// s seconds
// S miliseconds
// E days of the week in words;
// F days in the week in int
// w week in of the year
// W week the a month
// a returns am or pm
// k hour of the day in 24hr
// K hour of the day in 12hr pm or am
// z timezone
// '' is been used to recognize a text
