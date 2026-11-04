package phones;

/**
 * Class that extends the phone class but is wired so it includes more
 * methods and variables: voltage, connected, isConnected()
 *
 * @author socrates
 */
public abstract class DeskPhone extends Phone{
    private Voltage voltage;
    private boolean connected;

    public DeskPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension);
        this.voltage = voltage;
        this.connected = false;
    }

    /**
     * Method that plugs in the DeskPhone and changes the value of {connected} to True.
     */
    public void plugIn(){
        connected = true;
    }

    /**
     * Method that unplugs the DeskPhone and changes the value of {connected} to False.
     */
    public void unplug(){
        connected = false;
    }

    /**
     * Method returns the value of connected to check if the DeskPhone is connected.
     * @return connected
     */
    public boolean isConnected(){
        return connected;
    }

    public Voltage getVoltage(){
        return voltage;
    }

    @Override
    public String toString() {
        String connectionInfo = connected ? "connected" : "not connected";
        return super.toString() + " " + voltage + " " + connectionInfo;
    }

}
