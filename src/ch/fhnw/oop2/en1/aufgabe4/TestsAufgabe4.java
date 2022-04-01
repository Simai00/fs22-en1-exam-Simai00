package ch.fhnw.oop2.en1.aufgabe4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsAufgabe4 {

    @Test
	public void testAdd() {
        // given
        JobScheduler scheduler = new JobScheduler();

        // when
        scheduler.addJob(new Job(1, "A"));
        scheduler.addJob(new Job(2, "B"));

        // then        
        assertEquals(2, scheduler.size());
    }

    @Test
	public void testSizeAfterRemoval() {
        // given
        JobScheduler scheduler = new JobScheduler();

        // when
        scheduler.addJob(new Job(1, "A"));
        scheduler.addJob(new Job(2, "B"));
        scheduler.nextJob();

        // then        
        assertEquals(1, scheduler.size());
    }

    @Test
	public void testOrder() {
        // given
        JobScheduler scheduler = new JobScheduler();
        Job a = new Job(3, "A");
        Job b = new Job(1, "B");
        Job c = new Job(42, "C");

        // when
        scheduler.addJob(a);
        scheduler.addJob(b);
        scheduler.addJob(c);

        // then        
        assertEquals(scheduler.nextJob(), b);
        assertEquals(scheduler.nextJob(), a);
        assertEquals(scheduler.nextJob(), c);
        assertEquals(0, scheduler.size());
    }

    @Test
	public void testOrderSamePriority() {
        // given
        JobScheduler scheduler = new JobScheduler();
        Job a = new Job(1, "A");
        Job b = new Job(1, "B");

        // when
        scheduler.addJob(a);
        scheduler.addJob(b);

        // then        
        assertEquals(scheduler.nextJob(), a);
        assertEquals(scheduler.nextJob(), b);
        assertEquals(0, scheduler.size());
    }
}
