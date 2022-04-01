package ch.fhnw.oop2.en1.aufgabe2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.function.Function;

public class TestsAufgabe2 {

    @Test
	public void testSameLength() {
        // given
        Function<Integer, Integer> identity = n -> n;

        // when
         List<Integer> result = CollectionUtils.map(List.of(1, 2, 3), identity);

        // then        
         assertEquals(3, result.size());
    }

    @Test
	public void testDouble() {
        // given
         Function<Integer, Integer> doubleIt = n -> n * 2;

        // when
         List<Integer> result = CollectionUtils.map(List.of(1, 2, 3), doubleIt);

        // then        
         assertEquals(Integer.valueOf(2), result.get(0));
         assertEquals(Integer.valueOf(4), result.get(1));
         assertEquals(Integer.valueOf(6), result.get(2));
    }

    @Test
	public void testStringToBoolean() {
        // given
         Function<String, Boolean> p = s -> s.length() > 3;

        // when
         List<Boolean> result = CollectionUtils.map(List.of("aaaa", "bbbbbb", "c"), p);

        // then        
         assertTrue(result.get(0));
         assertTrue(result.get(1));
         assertFalse(result.get(2));
    }

    @Test
	public void testEmpty() {
        // given
         Function<?, ?> identity = n -> n;

        // when
        // List<?> result = CollectionUtils.map(List.of(), identity);

        // then        
        // assertTrue(result.isEmpty());
    }
}

