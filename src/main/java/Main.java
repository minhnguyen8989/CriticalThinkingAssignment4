import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        ArrayList<Double> tempF = new ArrayList<>();

        double tempTotal = 0;

        for(int i = 0; i<days.length; i++){
            System.out.print("Enter the temperature °F in "+days[i] + ": ");
            double tempInput = sc.nextDouble();
            tempF.add(tempInput);
            tempTotal += tempInput;
        }

        double weeklyAverage = tempTotal/days.length;
        System.out.println("The average temperature in week is: " + weeklyAverage + "°F");
    }
}
