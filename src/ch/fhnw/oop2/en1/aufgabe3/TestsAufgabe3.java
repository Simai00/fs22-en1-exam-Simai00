package ch.fhnw.oop2.en1.aufgabe3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestsAufgabe3 {

    @Test
	public void testSize() {
        // // given
        DataStore<Integer> ds = new DataStore<>();

        // // when
        ds.save(1);
        ds.save(2);

        // // then        
        assertEquals(2, ds.size());
    }

    @Test
	public void testSizeWithSame() {
        // // given
        DataStore<String> ds = new DataStore<>();

        // // when
        ds.save("");
        ds.save("");
        ds.save("");

        // // then        
        assertEquals(3, ds.size());
    }

    @Test
	public void testSizeEmpty() {
        // // given
        DataStore<Float> ds = new DataStore<>();

        // // when
        // // ... nothing
        
        // // then        
        assertEquals(0, ds.size());
    }

    @Test
	public void testSortEmpty() {
        // // given
        DataStore<Float> ds = new DataStore<>();

        try {
            // when
            ds.sort();
            fail();
        } catch (IllegalStateException ise) {
            // then
            assertTrue(true);
        }
    }

    @Test
	public void testSortNonEmpty() {
        // // given
        DataStore<Integer> ds = new DataStore<>();
        ds.save(3);
        ds.save(-1);
        ds.save(1);

        // // when
        List<Integer> result = ds.sort();

        // // then        
        assertEquals(Integer.valueOf(-1), result.get(0));
        assertEquals(Integer.valueOf(1), result.get(1));
        assertEquals(Integer.valueOf(3), result.get(2));
    }

    @Test
	public void testSortReturnsUnmodifiableList() {
        // // given
        DataStore<Integer> ds = new DataStore<>();
        for (int i = 0; i < 5; i++) {
            ds.save(i);
        }

        // // when
        List<Integer> result = ds.sort();
        try {
            // then
            result.add(42);
            fail("Die zurückgegebene Liste soll nicht modifizierbar sein!");
        } catch (UnsupportedOperationException uoe) {
            assertEquals(5, ds.size());
        }
    }
}