interface Sayable{
    public String say();
    public String klk();
}
public class LambdaExpressionExample1{
	public static void main(String[] args) {
		Sayable s=()->{
			return "I have nothing to say.";
		};  
		System.out.println(s.say());
	}
}
