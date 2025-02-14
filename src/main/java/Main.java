import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Days and Temperatures array list
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        ArrayList<Double> tempF = new ArrayList<>();

        //Declare Variables
        double tempTotal = 0;
        double weeklyAverage = 0;

        //Prompt user to input temperatures °F loop structures
        for(int i = 0; i<days.length; i++){
            System.out.print("Enter the temperature °F in " + days[i].toUpperCase() + ": ");
            double tempInput = sc.nextDouble();
            tempF.add(tempInput);
            tempTotal += tempInput;
        }

        //weeklyAverage Calculation
        weeklyAverage = tempTotal/days.length;

        //Print each day temperature °F and average temperature in week with loop structures
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i].toUpperCase() + " temperature is: " + tempF.get(i));
        }
        System.out.println("The average temperature in week is: " + Math.ceil(weeklyAverage) + "°F");
    }
}
