package ch.fhnw.oop2.en1.aufgabe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List; 

public class TestsAufgabe1 {

    @Test
	public void test123() {
        // given
         List<List<Integer>> ns = new ArrayList<>();
         ns.add(List.of(1, 2, 3));
         ns.add(List.of(1, 2, 3));

        // when
         int result = Maths.sum(ns);

        // then        
         assertEquals(4, result);
    }

    @Test
	public void testOnlyEvenNumber() {
        // given
        // List<List<Integer>> ns = new ArrayList<>();
        // ns.add(List.of(2, 42, 84));
        // ns.add(List.of(0, 0, 0, 2));

        // when
        // int result = Maths.sum(ns);

        // then        
        // assertEquals(130, result);
    }

    @Test
	public void testNoEvenNumber() {
        // given
        // List<List<Integer>> ns = new ArrayList<>();
        // ns.add(List.of(1, 3, 5));
        // ns.add(List.of(1, 3));

        // when
        // int result = Maths.sum(ns);

        // then        
        // assertEquals(0, result);
    }

    @Test
	public void testNoElement() {
        // given
        // List<List<Integer>> ns = new ArrayList<>();        

        // when
        // int result = Maths.sum(ns);

        // then        
        // assertEquals(0, result);
    }
}

