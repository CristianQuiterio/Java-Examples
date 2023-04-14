package interfacedemo;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Measurable, Comparable<BankAccount>
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount) throws IllegalArgumentException 
   {   
      balance = balance - amount;
      if(amount > balance)
      {
          throw new IllegalArgumentException("Amount Exceeds Balance");
      }
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   @Override
   public double getMeasure()
   {
   return balance;
   }
   
   public int compareTo(BankAccount obj)
   {
       BankAccount otheracct = (BankAccount) obj;
       if(this.balance > otheracct.getBalance())
       {
           return -1;
       }
       else if (this.balance == otheracct.getBalance())
       {
           return 0;
       }
       return 1;
   }
}
