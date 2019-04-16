import java.util.Scanner;

public class MonthAndDay {
    public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
    boolean loop = true;
    while(loop){
   if(birthMonth(keyboard))
       System.out.println("What day were you born (Sunday-Saturday");
   System.out.println(birthDay(keyboard));
   System.out.println("What is the year you were born");
   System.out.println(yearBorn(keyboard));

   loop = !loop;
    }




    }
    public static boolean birthMonth(Scanner keyboard){
        System.out.println("There is an old  nursery rhyme");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        System.out.println("What month were you born (enter as a number please)");
        int month = keyboard.nextInt();
        switch(month){
            case 1:
                System.out.println("So you were born in January");
                break;
            case 2:
                System.out.println("So you were born in February");
                break;
            case 3:
                System.out.println("So you were born in March");
                break;
            case 4:
                System.out.println("So you were born in April");
                break;
            case 5:
                System.out.println("So you were born in May");
                break;
            case 6:
                System.out.println("So you were born in June");
                break;
            case 7:
                System.out.println("So you were born in July");
                break;
            case 8:
                System.out.println("So you were born in August");
                break;
            case 9:
                System.out.println("So you were born in September");
                break;
            case 10:
                System.out.println("So you were born in October");
                break;
            case 11:
                System.out.println("So you were born in November");
                break;
            case 12:
                System.out.println("So you were born in December");
                break;
                default:
System.out.println("Wow I had no idea there was that many months in 1 year");

        }
        return false;

    }
    public static boolean birthDay(Scanner keyboard){
        System.out.println("I would like to know what day you were born");
    int day = keyboard.nextInt();
        switch(day){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                break;
            case 30:
                break;
            case 31:
                break;



default:
    System.out.println("That is not a real day");
        }

        return false;
    }
    public static boolean yearBorn(Scanner keyboard){
    int year = keyboard.nextInt();
    switch(year){
        case 2000:
            System.out.println("2000");
        case 2001:
            System.out.println("2001");
        case 2002:
            System.out.println("2002");
        case 2003:
            System.out.println("2003");
        case 2004:
            System.out.println("2004");
        default:
            System.out.println("You were born before 2000");




    }
    return false;
    }

}