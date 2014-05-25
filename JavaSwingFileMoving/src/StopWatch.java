/**
 * This class is not just a simple stopwatch class - it is used to determine the moving speed in the last certain interval
 * (instant moving speed)
 * @author rusucosmin
 */
public class StopWatch {
    public long startTime, movedBytes;
    public void StopWatch() {
    }
    
    public void start(long movedBytes) {
        startTime = System.currentTimeMillis();
        this.movedBytes = movedBytes;
    }
    
    public long getMovedBytes(long soFar) {
        return soFar - movedBytes;
    }
    
    public long getTimeElapsed() {
        return System.currentTimeMillis() - startTime;
    }
    
    public double getInstantSpeed(long soFar) {
        return 1000.0 * getMovedBytes(soFar) / getTimeElapsed();
    }
}
