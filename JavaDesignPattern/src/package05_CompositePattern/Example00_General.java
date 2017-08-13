package package05_CompositePattern;

import java.util.ArrayList;
import java.util.List;

class MathOperation{
	private int x;
	private int y;
	private List<MathOperation> subOperations;

   // constructor
   public MathOperation(int x,int y) {
      this.x = x;			this.y = y;												subOperations = new ArrayList<MathOperation>();}
   public void addOperation(MathOperation m) {				subOperations.add(m);}
   public void removeOperation(MathOperation m) {        subOperations.remove(m);}
   public List<MathOperation> getOperation(){					return subOperations;  }
   public String toString(){														return ("MathOperation :[ x : " + x + ", y : " + y + " ]");}
}

public class Example00_General {

	public static void main(String[] args) {
		MathOperation op = new MathOperation(0,0);
		MathOperation op10 = new MathOperation(1,0);
		MathOperation op11 = new MathOperation(1,1);
		MathOperation op20 = new MathOperation(2,0);
		MathOperation op21 = new MathOperation(2,1);
		
		op.addOperation(op10);
		op.addOperation(op11);

		op10.addOperation(op20);
		op11.addOperation(op21);

		System.out.println(op);
		
        for (MathOperation mainOps : op.getOperation()) {
           System.out.println(mainOps);
           for (MathOperation subOps : mainOps.getOperation()) {
              System.out.println(subOps);
           }
        }
	}

}
