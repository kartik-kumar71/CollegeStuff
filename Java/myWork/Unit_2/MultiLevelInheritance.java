class Grandpa {
  Grandpa() {
    System.out.println("Goes to temple");
  }
}

class Father {
  Father() {
    System.out.println("Goes to work");
  }
}

class Child {
  Child() {
    System.out.println("Goes to school");
  }
}

public class MultiLevelInheritance {
  public static void main(String [] args) {
    Grandpa g1 = new Grandpa();
    Father f1 = new Father();
    Child c1 = new Child();
  }

}
