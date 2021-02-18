public class ZadanieDomowe6 {

    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("samsung");
        IOSApp iphone = new IOSApp("srajfon");
        android.runAndroidApp();
        iphone.runIOSApp();
        iphone.appInfo();
    }


}
