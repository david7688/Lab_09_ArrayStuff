import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random gen = new Random();

        // Declare
        final int DATA_SIZE = 100;

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        int data[] = new int[DATA_SIZE];


        // prints out array

        for (int i = 0; i < dataPoints.length; i++)
            dataPoints[i] = gen.nextInt(100) + 1;

        for (int d = 0; d < data.length; d++) {
            data[d] = rnd.nextInt(100) + 1;  // 1 - 100
            System.out.printf("%5d", data[d]);
        }

        int sum = 0;
        double ave = 0;
        for (int i = 0; i < dataPoints.length; i++)
            sum += dataPoints[i];

        System.out.println("\nThe sum of values is " + sum);

        // ABOVE: solves and prints out sum

        ave = (double) sum / dataPoints.length;
        System.out.println("The average is " + sum / dataPoints.length);

        // ABOVE: solves and prints out average



        // question2b tells how much a number appears in the array

        int target2 = SafeInput.getRangedInt(in, "Enter search value ", 1, 100);

        int counter = 0;

        for(int x : data) {
            if(x == target2){
                counter++;
            }
        }

        System.out.println("The number " + target2 + " appeared " + counter + " times");

        // tells where user input value appears in the array

        int target = SafeInput.getRangedInt(in, "Enter search value ", 1, 100);
        boolean foundFlag = false;
        for(int d = 0; d < data.length; d++)
        {
            if(data[d] == target)  // got a new max
            {
                System.out.println("The value " + target + " was found at array index " + d);
                foundFlag = true;
            }
        }
        if(!foundFlag)
            System.out.println("Value not found");
        System.out.println("");

        //question2d

        int dataMin = data[0];
        for(int d = 0; d < data.length; d++)
        {
            if(data[d] < dataMin)  // got a new min
            {
                dataMin = data[d];  // remember it
            }
        }
        System.out.println("Min is: " + dataMin);

        int dataMax = data[0];
        for(int d = 0; d < data.length; d++)
        {
            if(data[d] > dataMax)  // got a new max
            {
                dataMax = data[d];  // remember it
            }
        }
        System.out.println("Max is: " + dataMax);


    }

    // could not figure out question 2e
    public static double getAverage(int values[])
    {
        int dataPoints = 0;
        System.out.println("Average of dataPoints is: " + getAverage(new int[]{dataPoints}));
        return 0;
    }


}