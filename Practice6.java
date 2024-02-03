package Week_3_day4;

//Question6 and Question7 combined
interface TVRemote {
    void powerOn();
  
    void powerOff();
  
  }
  
  interface SmartTVRemote extends TVRemote {
    void openApp(String appName);
  
    void browseInternet();
  }
  
  class MySmartTVRemote implements SmartTVRemote {
    @Override
    public void powerOn() {
      System.out.println("Smart TV is powered on");
    }
  
    @Override
    public void powerOff() {
      System.out.println("Smart TV is powered off");
    }
  
    @Override
    public void openApp(String appName) {
      System.out.println("Opening " + appName + " app");
    }
  
    @Override
    public void browseInternet() {
      System.out.println("Browsing the internet");
    }
  
  }
  
  public class Practice6 {
    public static void main(String[] args) {
      MySmartTVRemote remote = new MySmartTVRemote();
  
      remote.powerOn();
      remote.openApp("Netflix");
      remote.browseInternet();
      remote.powerOff();
    }
  }
  