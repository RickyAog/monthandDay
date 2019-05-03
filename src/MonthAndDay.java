import java.util.Scanner;

public class MonthAndDay {
    public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);

    boolean loop = true;
    while(loop){
   if(loop)


        System.out.println(h(keyboard));
    }
    }
    public static int birthMonth(Scanner keyboard){
        System.out.println("What month were you born (enter as a number please)");
        int birthMonth = keyboard.nextInt();
        switch(birthMonth){
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
                default:
                    if(birthMonth == 1){
                        birthMonth = 13;
                    }
                    if(birthMonth == 2){
                        birthMonth =14;
                    }
System.out.println("Wow I had no idea there was that many months in 1 year");
        }
        return birthMonth;
    }
    public static int birthDay(Scanner keyboard){
        System.out.println("I would like to know what day you were born");
    int birthDay = keyboard.nextInt();
        switch(birthDay){
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
        return birthDay;
    }
    public static int yearBorn(Scanner keyboard){
    System.out.println("What year were you born");
        int yearBorn = keyboard.nextInt();
    switch(yearBorn){
        case 2000:
            break;
        case 2001:
            break;
        case 2002:
            break;
        case 2003:
            break;
        case 2004:
            break;
        case 2005:
            break;
        case 2006:
            break;

    }
    return yearBorn;
    }
    public static boolean h (Scanner Keyboard){
        System.out.println("There is an old  nursery rhyme");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        int q = birthDay (Keyboard);
        int m = birthMonth(Keyboard);
        int k = yearBorn(Keyboard)%100;
        int j = yearBorn(Keyboard)/100;
        int h = (q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j)%7;

        if (h ==1){
            System.out.println("You were born on a Sunday" +
            " The poem says 'But the child born on the Sabbath Day,Is fair and wise and good in every way'");
        }
        else if (h == 2){
            System.out.println("You were born on a Monday" +
            " The poem says 'Monday's child is fair of face'" );
        }
        else if(h == 3){
            System.out.println("You were born on a Tuesday" +
                    " The poem says 'Tuesday's child is full of grace' ");
        }
        else if(h == 4){
            System.out.println("You were born on a Wednesday" +
                    " The poem says 'Wednesday's child is full of woe'");
        }
        else if(h == 5){
            System.out.println("You were born on a Thursday" +
                    " The poem says 'Thursday's child has far to go'");
        }
        else if(h == 6){
            System.out.println("You were born on a Friday" +
                    " The poem says'Friday's child is loving and giving'");
        }
        else if(h == 0){
            System.out.println("You were born on a Saturday" +
                    " The poem Says 'Saturday's child works hard for a living'");
        }

       return h(Keyboard);
    }
}