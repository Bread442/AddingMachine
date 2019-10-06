package cse360assign2;

/* This is a class that can save the history of addition and subtraction operation
 * and translate into a string using toString()
 */
public class AddingMachine {

	private int total;		// Total value
	private StringBuilder sb;	// History String
	
	public AddingMachine () {
		total = 0;
		sb = new StringBuilder("0");
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		sb.append(" + ");
		sb.append(value);
	}
	
	public void subtract (int value) {
		total -= value;
		sb.append(" - ");
		sb.append(value);
		
	}
		
	public String toString () {
		return sb.toString();
	}

	public void clear() {
		sb.delete(1, sb.length());
		total = 0;
	}
}
