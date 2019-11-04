public class StringBuild {
  public static void main(String [] args) {
    StringBuilder a = new StringBuilder("abcdefghi");
    System.out.println(a);
    a.replace(1,3,"ooo");
    System.out.println(a);
    a.delete(7, 10);
    System.out.println(a);
  }
}
