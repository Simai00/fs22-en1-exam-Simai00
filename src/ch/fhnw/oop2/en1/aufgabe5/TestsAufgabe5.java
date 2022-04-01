package ch.fhnw.oop2.en1.aufgabe5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue; 

public class TestsAufgabe5 {

    @Test
	public void testFirstFibonacciNumber() {
        // given
        IntSequence fib = new FibonacciSequence();

        // when
        int result = fib.next();

        // then        
         assertEquals(0, result);
         assertTrue(fib.hasNext());
    }

    @Test
	public void testSecondFibonacciNumber() {
        // given
         IntSequence fib = new FibonacciSequence();

        // when
         fib.next();
         int result = fib.next();

        // then        
         assertEquals(1, result);
         assertTrue(fib.hasNext());
    }

    @Test
	public void testPostSecondFibonacciNumber() {
        // given
       IntSequence fib = new FibonacciSequence();

        // when
         assertTrue(fib.hasNext());
         fib.next(); // 0.
         assertTrue(fib.hasNext());
         fib.next(); // 1.

        // then       
         assertTrue(fib.hasNext());
         assertEquals(1, fib.next()); // 2.

         assertTrue(fib.hasNext());
         assertEquals(2, fib.next()); // 3.
        
         assertTrue(fib.hasNext());
         assertEquals(3, fib.next()); // 4.

         assertTrue(fib.hasNext());
         assertEquals(5, fib.next()); // 5.

         assertTrue(fib.hasNext());
         assertEquals(8, fib.next()); // 6.

         assertTrue(fib.hasNext());
         assertEquals(13, fib.next()); // 7.
    }

    @Test
	public void testTwentiethFibonacciNumber() {
        // given
         IntSequence fib = new FibonacciSequence();

        // when
         for (int i = 0; i <= 19; i++) {
             if(fib.hasNext()) {
                 fib.next();
             }
         }

        // then                       
         assertTrue(fib.hasNext());
         assertEquals(6765, fib.next()); // 20.
    }   

    @Test
	public void testEndOfSequence() {
        // given
         IntSequence fib = new FibonacciSequence();

        // when
         for (int i = 0; i <= 39; i++) {
             if(fib.hasNext()) {
                 fib.next();
             }
         }

        // then                       
         assertTrue(fib.hasNext());
         assertEquals(102334155, fib.next()); // 40.

         assertFalse(fib.hasNext());  // Abbruch der Folge beim 41. Folgeglied
    }   
}
