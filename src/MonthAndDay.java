import java.util.Scanner;

public class MonthAndDay {
    public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
    boolean loop = true;
    while(loop){
   if(birthMonth(keyboard))
       System.out.println("What day were you born (Sunday-Saturday");
   System.out.println(birthDay(keyboard));
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

    }

 return false;
    }
}