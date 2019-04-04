import java.util.Scanner;

public class MonthAndDay {
public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println(birthDate(keyboard));
}
public static Scanner birthDate(Scanner dateBorn){
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
    String monthBorn = dateBorn.nextLine();


return(dateBorn);


    }
}
