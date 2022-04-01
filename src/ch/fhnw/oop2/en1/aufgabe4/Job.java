package ch.fhnw.oop2.en1.aufgabe4;

public class Job implements Comparable {

    private int prio;
    private String desc;

    public Job(int prio, String desc) {
        this.prio = prio;
        this.desc = desc;
    }

    @Override
    public int compareTo(Object o) {
        if (! (o instanceof Job)) {
            return -1;
        }
        return Integer.compare(prio, ((Job) o).getPrio());
    }

    public int getPrio() {
        return prio;
    }

    public String getDesc() {
        return desc;
    }
}
