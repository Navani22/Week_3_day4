package Week_3_day4;

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class Smartphone extends Telephone {
    @Override
    void ring() {
        System.out.println("Smartphone is ringing");
    }

    @Override
    void lift() {
        System.out.println("Smartphone is lifted");
    }

    @Override
    void disconnect() {
        System.out.println("Smartphone is disconnected");
    }

}

public class Practice4 {
    public static void main(String[] args) {
        Telephone phone = new Smartphone(); 
        phone.ring(); 
        phone.lift(); 
        phone.disconnect(); 

      
    }
}
