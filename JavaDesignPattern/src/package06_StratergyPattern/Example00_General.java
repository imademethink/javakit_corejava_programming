package package06_StratergyPattern;

interface Strategy {
	   public int doOperation(int num1, int num2);
}
class OpsAddition implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
}

class OpsSubtract implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 - num2;
	   }
}
class OpsContext {
	   private Strategy strategy;
	   public OpsContext(Strategy strategy){
	      this.strategy = strategy;
	   }
	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
}

public class Example00_General {

	public static void main(String[] args) {
	      OpsContext opsContext1 = new OpsContext(new OpsAddition());
	      System.out.println("Using Addition stratergy 98 + 1 = " + opsContext1.executeStrategy(10, 5));

	      OpsContext opsContext2 = new OpsContext(new OpsSubtract());
	      System.out.println("Using Subtract stratergy 56 - 6 = " + opsContext2.executeStrategy(10, 5));
	}

}
