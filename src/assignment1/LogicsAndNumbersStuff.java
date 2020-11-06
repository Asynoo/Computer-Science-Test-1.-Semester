package assignment1;

import java.util.Arrays;

public class LogicsAndNumbersStuff {

    /**
     * This method returns the difference between a and b, by subtracting b from a, multiplied by c.
     * @param a The first number
     * @param b The second number
     * @param c The last number
     * @return The difference of a and b, multiplied by c.
     */
    public int diffMultipliedByC(int a, int b, int c)
    {
        return (a-b)*c;
    }

    public boolean canYouStayInBed(boolean weekday, boolean vacation)
    {
        if (weekday && !vacation)
        {
            return false;
        }
        else if (vacation)
        {
            return true;
        }
        else {
            return true;
        }
    }

    /**
     * This method returns the sum of all the given numbers
     * @param numbers The array containing all the numbers to calculate the sum of.
     * @return The sum of all integers in the numbers array.
     */
    public int sumOfNumbers(int[] numbers)
    {
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result;
    }

    /**
     * This method returns the average of all the given numbers.
     * @param numbers The array containing all the numbers to calculate the average of.
     * @return The average of all the integers in the numbers array.
     */
    public double averageOfNumber(int[] numbers)
    {
        return Arrays.stream(numbers).average().orElse(Double.NaN);
    }

    /**
     * Finds the number in the array that occurs the most times.
     * Say that the array is [1,2,5,42,42,42] the the return value should be 42 since that number occurs 3 times.
     * If there is a tie, as with the array [42,42,1984,1984,1,2,3] where both 42 and 1984 occurs twice,
     * the number that appears first in the array must be the return value. So in that case 42 should be returned.
     * @param numbers The array of numbers.
     * @return The number that occurs most often in the array.
     */
    public int numberWithMostOccurrences(int[] numbers)
    {
        int count = 1, tempCount;
        int popular = numbers[0];
        int temp = 0;
        for (int i = 0; i < (numbers.length - 1); i++)
        {
            temp = numbers[i];
            tempCount = 0;
            for (int j = 1; j < numbers.length; j++)
            {
                if (temp == numbers[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

}
