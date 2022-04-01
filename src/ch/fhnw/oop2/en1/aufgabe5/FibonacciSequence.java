package ch.fhnw.oop2.en1.aufgabe5;

public class FibonacciSequence implements IntSequence {

    int i1 = 0;
    int i2 = 1;
    int f = 0;

    @Override
    public int next() {
        f++;
        int i = i1;
        i1 = i2;
        i2 = i1 + i2;
        return i;
    }

    @Override
    public boolean hasNext() {
        return f <= 41;
    }
}
