
/**
 * Exercise 5.13: Write a code fragment that generates a 
 * random integer using the Random class.
 * 
 * Exercise 5.14: Create a new class, create methods to
 * print one random number or several.
 * 
 * 
 * Note: for simplicity, numbers generated are between 0-99
 * 
 * 
 * @author Mathih13
 * @version 1
 */

import java.util.Random;

public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random RNG;
    private int output;
    // The range of random numbers
    private int range;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        RNG = new Random(); // RNG = Random Number Generator
        range = 100; // Range will be 0-99
    }

    /**
     * Generates one random number.
     */
    public void generateOneRandom() {
        output = RNG.nextInt(range);
        printResult();
    }
    
    /**
     * Generates multiple random numbers.
     * 
     * @param  howMany   how many numbers should be created.
     */
    public void generateOneRandom(int howMany) {
        for (int i = 0; i < howMany; i++) {
            output = RNG.nextInt(range);
            printResult();
        }
        
        
    }
    
    /**
     * Prints the current value of "output"
     */
    private void printResult() {
        System.out.println(throwDice());
    }
    
    
    /**
     * Exercise 5.16: Write a method in your class called throwDice 
     * that returns a random number between 1 and 6
     * 
     * We will make the method return the result. 
     * The return will not be used as of now.
     * 
     */
    private int throwDice() {
        // Generating from "min" to "max"
        // random.nextInt(max) + 1
        output = RNG.nextInt(6) + 1;
        return output;
    }
    
    
}
