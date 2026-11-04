package phones;

public class DeskPhone extends Phone{
    private Voltage voltage;
    private boolean connected;

    public DeskPhone(String model, Dimension dimension, Voltage voltage, boolean connected) {
        super(model, dimension);
        this.voltage = voltage;
        this.connected = connected;
    }

    public void plugIn(){
        connected = true;
    }

    public void unplug(){
        connected = false;
    }

    public boolean isConnected(){
        return connected;
    }

    @Override
    public String toString() {
        String connectionInfo = connected ? "connected" : "not connected";
        return super.toString() + " " + voltage + " " + connectionInfo;
    }

}
