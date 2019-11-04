public class AnonymousArray{

    static void square(int arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]*arr[i]);
      }
    }

    public static void main(String[] args) {
      square(new int[]{7,34,12,67,3});
  }
}
