package Lesson13Tests;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
 
public class MainTest {
    @Test
    public void equality(){
        String value = "3.13";
        String value1 = "1";
        Assert.assertFalse(value1.equals(value));
    }

    @Test
    public void testSum(){
          Calculations sum = new Calculations();
          int result = sum.Sum(2,3);
          assertTrue(result==5);
    }

    @Test
    public void testMinus(){
        Calculations minus = new Calculations();
        int result = minus.Minus(2,2);
        assertTrue(result==0);
    }

    @Test
    public void isPositive(){
        int num = 3;
        assertTrue(num > 0);
    }

    @Test
   public void arrEqual(){
        int arrFirst[] = {1,2,3,5};
        int arrSecond[] = {1,2,3,5};
        Assert.assertArrayEquals(arrFirst, arrSecond);
    }

    @Test
    public void sort(){
        int arr[]={1,2,4};
        int sortedArr[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void isString(){
        String str = "Hello World";
        assertTrue(str.contains("Hello"));
    }
}
