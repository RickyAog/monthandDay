import java.util.Scanner;

public class MonthAndDay {
public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println(birthDate(keyboard));
}
public static String birthDate(Scanner dateBorn){
System.out.println("There is an old saying");

System.out.println("Monday's child is fair of face,");
System.out.println("Tuesday's child is full of grace,,");
System.out.println("Wednesday's child is full of woe,");
System.out.println("Thursday's child has far to go.");
System.out.println("Friday's child is loving and giving,");
System.out.println("Saturday's child works hard for a living,\n" +
        "But the child born on the Sabbath Day,\n" +
        "Is fair and wise and good in every way.");

System.out.println("Now may I ask what month were you born");
    int monthBorn = dateBorn.nextInt();
switch(monthBorn){
    case 1:
        return "January";
        break;
    case 2:
        return "February";
        break;
    case 3:
        return"March";
        break;
    case 4:
        return "April";
        break;
    case 5:
        return "May";
        break;
    case 6:
        return "June";
        break;
    case 7:
        return "July";
        break;
    case 8:
       return "August";
        break;
    case 9:
        return "September";
        break;
    case 10:
        return "October";
        break;
    case 11:
        return "November";
        break;
    case 12:
        return "December";
        break;
}


    return monthBorn;

    }
}
