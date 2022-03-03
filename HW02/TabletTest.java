public class TabletTest {
    public static void main(String[] args) {
        Tablet blankTablet = new Tablet();
        Tablet myTablet = new Tablet(3, (float) 6.7, false);

        myTablet.setWifiOnly(true);

        System.out.println("My tablet attributes:");
        System.out.println("weight: " + myTablet.getWeight());
        System.out.println("screen size: " + myTablet.getScreenSize());
        System.out.println("wifiOnly: " + myTablet.getWifiOnly());

        System.out.println();

        System.out.println("Blank tablet attributes:");
        System.out.println("weight: " + blankTablet.getWeight());
        System.out.println("screen size: " + blankTablet.getScreenSize());
        System.out.println("wifiOnly: " + blankTablet.getWifiOnly());

    }
}
