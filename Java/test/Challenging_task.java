public class Challenging_task {

    static <T> T sum(T[] arr){

        if(arr[1] instanceof Integer){
            Integer sum = 0;
            for (T i : arr) {
                int e = (Integer) (i);
                sum = sum + e;
            }

            return ((T) sum);
        }


        else if(arr[1] instanceof Float){
            Float sum = 0.0f;
            for (T i : arr){
                float e = (Float) (i);
                sum = sum + e;
            }

            return ((T) sum);
        }

        else if(arr[1] instanceof Double){
            Double sum = 0.0;
            for (T i : arr){
                double e = (Double) (i);
                sum = sum + e;
            }

            return ((T) sum);
        }

        else {
            return null;
        }

    }

    public static void main(String args[]){

        Integer arr[]={7,4,6,2,6};
        Float arr2[]={3.34f,34.435f,345.5f};
        Double arr3[]={6.6,45.0,546.5,50.9};
        int a = (Integer) (sum(arr));
        float b = (Float) (sum(arr2));
        double c = (Double) (sum(arr3));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
