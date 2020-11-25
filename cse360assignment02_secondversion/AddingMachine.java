package cse360assignment02;

public class AddingMachine {
  private int total;
  private StringBuilder historyOfTransaction;//create a string of history to keep the history of transaction to be returned 
  //create a AddingMachine function 
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    historyOfTransaction = new StringBuilder("0");//using stringBuilder to append the string value together
    //can use stringBuffer in this case to concantenation 
  }
  //the getTotal will return the total value at the current 
  public int getTotal () {
    return total;//return the current total value 
  }
  //add function will add the parameter value that pass in the function to the current total
  public void add (int value) {
	  total = total + value; // add the value parameter to the total variable
	  historyOfTransaction.append(" + " + value);
  }
  //subtract funtion will take the current total and subtract the value passing in the parameter 
  public void subtract (int value) {
	  total = total - value;//subtract the value parameter from the total 
	  historyOfTransaction.append(" - " + value);

  }
  
// toString function will return the string of the history calculation
  public String toString () {
    return historyOfTransaction.toString();
  }

  public void clear() {
  } 
}
