package ch.fhnw.oop2.en1.aufgabe4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class JobScheduler {

    private PriorityQueue<Job> queue;
    private Iterator<Job> iterator;

    public JobScheduler() {
        this.queue = new PriorityQueue<>();
        this.iterator = queue.iterator();
    }

    public void addJob(Job job) {
        queue.add(job);
    }

    public int size() {
        return queue.size();
    }

    public Job nextJob() {
        if (iterator.hasNext()) {
            Job job = iterator.next();
            return job;
        }
        return null;
    }
}
