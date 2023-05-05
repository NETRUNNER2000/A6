
public class Monitorable {
    private int probeCount = 0;
    /**
    * Obtain the number of probes of the hash table structure that have
    * occurred since start-up or the last resetProbeCount().
    */
    public int getProbeCount() {
        return probeCount;
    }
    /**
    * Increment the probe count.
    */
    public void incProbeCount(){
        probeCount ++;
    }
    /**
    * Reset the probe counter to zero.
    */
    public void resetProbeCount(){
        probeCount = 0;
    }

}
