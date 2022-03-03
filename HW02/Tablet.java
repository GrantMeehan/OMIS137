public class Tablet {
    private int weight;
    private float screenSize;
    private boolean wifiOnly;

    public Tablet(){
        weight = 3;
        screenSize = 5;
        wifiOnly = false;
    }

    public Tablet(int weight, float screenSize, boolean wifiOnly) {
        this.weight = weight;
        this.screenSize = screenSize;
        this.wifiOnly = wifiOnly;
    }

    public int getWeight() {
        return weight;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public boolean getWifiOnly() {
        return wifiOnly;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public void setWifiOnly(boolean wifiOnly) {
        this.wifiOnly = wifiOnly;
    }
}
