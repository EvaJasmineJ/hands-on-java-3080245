package bank;

public class Account {
  
  private int id;
  private String type;
  private double balance;

  /* create a constructor
  when someone needs to instantiate a new account object, 
  they can easily do so by passing the values 
  of each of the fields */


  public Account(int id, String type, double balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
