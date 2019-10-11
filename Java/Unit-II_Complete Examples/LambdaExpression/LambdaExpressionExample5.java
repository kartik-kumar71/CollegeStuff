interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample5 {  
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            System.out.println("a="+a);
							System.out.println("b="+b);
							return (a+b);   
                            };  
        System.out.println("Addition of a&b is="+ad2.add(100,200));  
    }  
}  