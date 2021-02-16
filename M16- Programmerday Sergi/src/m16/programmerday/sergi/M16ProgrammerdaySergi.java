/*
Author: Sergi
Date: 16/02/21
 */
package m16.programmerday.sergi;


public class M16ProgrammerdaySergi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day=13, month=9, year=2021;
        String atDat=diaNacimiento_ZELLER( day,  month,  year);
        System.out.println("International programmer's day is "+atDat+" of september.");
    }
    
    private static String diaNacimiento_ZELLER(int day, int month, int year) {
        String[] arrayweek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return arrayweek[d];
    }
    
}
