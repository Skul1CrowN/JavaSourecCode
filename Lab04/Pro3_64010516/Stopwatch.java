public class Stopwatch {
    private long startTime;
    private long endTime;
    public Stopwatch() {
        startTime = System.nanoTime();
        endTime = startTime;
    }
    public void start() {
        startTime = System.nanoTime();
    }
    public void stop() {
        endTime = System.nanoTime();
    }
    public double getElapsedTime() {
        return (endTime - startTime)/1000000F;
    }
}
