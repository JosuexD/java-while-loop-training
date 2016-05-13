/*
 * Josue Magallanes
 * Title: While loop training
 * Date: February 24
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner keyboard = new Scanner(System.in); //creating keyboard object to take user input

        int numbers[]= new int[3]; //creating an array called numbers, and initializing the memory to three addresses
        int average; //create unintialize for average
        int x = 0; //we create a random variable that will be used for looping
        int sum = 0; //initialize the sum variable as 0, since we will be adding on to this
        int product = 1; //this variable is initialized at 1, since we will be multiplying by it.
        int smallest = 0;
        int largest = 0;
        while( x < 3) //makes a while loop that will loop three times, since x = 0 : 0, 1, 2. We use the look to ask the user for a number and enter them into the array we created
        {
            System.out.println("Enter a number: ");
            numbers[x] = keyboard.nextInt();
            x = x + 1; // we increment the x variable so we don't loop forever
            //System.out.println(x);
        }
        x = 0; // reset the x variable to 0
        while(x < 3) //we craftily use another while loop to obtain the sum and product of our three numbers stored in the array
        {
            sum = sum + numbers[x];
            product = product * numbers[x];
            x = x + 1;

        }

        average = sum /3; //we use the sum value and divide by 3(the total numbers we have) to obtain the average

        //displays the information
        System.out.printf("Sum is: %d\n", sum);
        System.out.printf("Product is: %d\n", product);
        System.out.printf("Average is: %d\n", average);


        x = 0; //reset x variable to 0
        while (x < 3)
        {
            if (numbers[x] > largest) //checks the array of numbers, starting from 0, and compares it to a preinitialize variable called largest, if its larger than our predetermined variable, it will declare it as such
            {
                largest = numbers[x];
            }
            else //if the number is not larger, than we can claim it is smallest, this is repeated over and over to obtain our largest and smallest number.
            {
                smallest = numbers[x];
            }
            x = x+1;
        }
        System.out.printf("Smallest is %d\n", smallest);
        System.out.printf("largest is %d\n", largest);


    }

}


      