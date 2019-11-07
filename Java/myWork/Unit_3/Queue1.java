

import java.util.*;


class Queue1 {
  public static void main(String args[]) {

    Queue<String> langs = new LinkedList<>();

    langs.add("Python");
    langs.add("Swift");
    langs.add("Objective-C");
    langs.add("Javascript");
    langs.add("C++");
    langs.add("Java");

    System.out.println("Queue --> " + langs);
    System.out.println("Removed from queue: " +langs.remove());
    System.out.println("Removed from queue: "+langs.poll());
    System.out.println("Removed from queue: "+langs.poll());
    System.out.println("Resulting queue: "+ langs);
  }
}
