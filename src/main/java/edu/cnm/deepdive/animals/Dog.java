package edu.cnm.deepdive.animals;


public class Dog extends Wolf {
  static {
    System.out.println("Dog static block");
  }
  {
    System.out.println("Dog Inst init block");
  }
  protected Dog(String name) {
    super(name);
  }

  @Override
  public void vocalize() {
    describe();
    System.out.println("Bark!");  }

  public void doTrick(){
    System.out.println("Look at my trick! I'm the best dog!");
  }

  public static void describe() {
    System.out.println("Domestic Dog (Canis Lupus Familiaris) is a divergent subspecies of Canis Lupus");
  }

}
