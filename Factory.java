import java.util.Scanner;
public class Factory{
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



interface Inter{
	public Double operate(Double numberA,Double numberB);
}
class Add implements Inter{
	public Double operate(Double numberA,Double numberB){
			Double result = numberA + numberB;
			return result;
		}
	
	}
class Sub implements Inter{
	public Double operate(Double numberA,Double numberB){
			Double result = numberA - numberB;
			return result;
		}
	
	}
class Cheng implements Inter{
	public Double operate(Double numberA,Double numberB){
			Double result = numberA * numberB;
			return result;
		}
	
	}

	
