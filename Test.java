import java.util.Scanner;
public class Test{
	public static void main(String [] args) {
	//private numberA,numberB,operate;
	Scanner sc = new Scanner(System.in);
	System.out.println("please input number a:");
	Double numberA = sc.nextDouble();
	System.out.println("please input number b:");
	Double numberB = sc.nextDouble();
	System.out.println("please input oprate:");
	String c = sc.next();
	System.out.println();

	JisuanFactory factory = new JisuanFactory();
	Inter inter = factory.produce(c);
	Double output = inter.operate(numberA,numberB);
	System.out.println(output);
	}
	
}

class JisuanFactory{
	public Inter produce(String c){		
		switch(c)
		{
			case "+":
				return new Add();
				//break;
			case "-":
				return new Sub();
				//break;
			case "*":
				return new Cheng();
		}
		return null;	
		}
				
	}



class Inter{
	public Double operate(Double numberA,Double numberB){
		return 0.0;
	}
}
class Add extends Inter{
	public Double operate(Double numberA,Double numberB){
			Double result = numberA + numberB;
			return result;
		}
	
	}
class Sub extends Inter{
	public Double operate(Double numberA,Double numberB){
			Double result = numberA - numberB;
			return result;
		}
	
	}
class Cheng extends Inter{
	public Double operate(Double numberA,Double numberB){
			Double result = numberA * numberB;
			return result;
		}
	
	}

	