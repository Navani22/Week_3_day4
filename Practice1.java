package Week_3_day4;

//Practice Question1,2

abstract class Pen {

    abstract void write();
  
    abstract void refill();
  }
  
  class FountainPen extends Pen {
    @Override
    void write() {
      System.out.println("Writing with Fountain Pen");
    }
  
    @Override
    void refill() {
  
      System.out.println("Refilling Fountain Pen");
    }
  
    void ChangeNib() {
      System.out.println("Changing the nib");
    }
  }
  
  public class Practice1 {
    public static void main(String[] args) {
  
      FountainPen fp = new FountainPen();
      fp.write();
      fp.refill();
      fp.ChangeNib();
  
    }
  
  }