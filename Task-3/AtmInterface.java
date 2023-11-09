import java.util.*;
class userbankaccount{
   double Actual_balance = 1000;
}
class Atm{
    int pin,length;
    userbankaccount obj1 = new userbankaccount();
    double balance = obj1.Actual_balance;
     Map<Double,String> statement=new HashMap<>(); 
    Scanner scan = new Scanner(System.in);
    void checkBalance(){
        System.out.println("Enter your 4-digit ATM Pin: ");
         pin = scan.nextInt();
         length = (int) (Math.log10(pin) + 1);
        if(length==4){
         System.out.println("Available Balance : Rs."+balance);  
         System.out.println("");  
        }
         else{
            System.out.println("Please Check your pin");
         }
    }
    void deposit(){
            
        System.out.println("Enter your 4-digit ATM Pin: ");
         pin = scan.nextInt();
         length = (int) (Math.log10(pin) + 1);
        if(length==4){
        System.out.print("Enter amount to deposit: Rs.");  
        
       double deposit = scan.nextInt(); 
       
        if(deposit<=49000){  
        statement.put(deposit," Deposited");           
        balance = balance + deposit;  
        System.out.println("Amount Deposited Successfully");  
        System.out.println(""); 
         
        }
        else{
            System.out.println("Limit Exceeded");
        }
        }
        else{
            System.out.println("Please Check your pin");
        }
    }
    void withdraw(){
        System.out.println("Enter your 4-digit ATM Pin: ");
        pin = scan.nextInt();
        length = (int) (Math.log10(pin) + 1);
        if(length==4){
        System.out.print("Enter withdrawl amount: Rs.");  
        double withdraw = scan.nextInt();
          statement.put(withdraw," Withdrawn");
        if(withdraw<10000){
        if(balance >= withdraw){  
            balance = balance - withdraw;  
            System.out.println("Withdrawl Successful");
            System.out.println("Please collect your cash");  
        }  
        else{    
            System.out.println("Insufficient Balance");  
        }  
        }
        else{
            System.out.println("Without OTP, unable to withdraw more than the limit.");
         System.out.println("Enter 6-digit Otp sent to you Registered mobile number: ");
         int otp=scan.nextInt();
         length = (int) (Math.log10(otp) + 1);
         if(length == 6){
          if(balance >= withdraw){  
            balance = balance - withdraw;  
            System.out.println("Withdrawl Successful");
            System.out.println("Please collect your cash");  
        }  
        else{    
            System.out.println("Insufficient Balance");  
        }    
        }
        else{
            System.out.println("Check your OTP");
        }
    }
        System.out.println(""); 
        }
        else{
            System.out.println("Please Check your pin");
        }
    }  
    public void ministatement() {
        for(Map.Entry<Double,String> m:statement.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }  
}
public class AtmInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to Automated Teller Machine");
        System.out.println("--------------------------------------");
        System.out.println("Please Insert your card");
        System.out.println("");
         Scanner scan1=new Scanner(System.in);
        Atm objAtm = new Atm();
        
        while(true){
            System.out.println("Choose 1 for Check Balance");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Withdraw"); 
            System.out.println("Choose 4 for Mini Statement"); 
            System.out.println("Choose 5 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
             int choice = scan1.nextInt();
             switch(choice){
                   case 1:
                    objAtm.checkBalance();
                    System.out.println("--------------------------------------");
                    break;
                   case 2:
                     objAtm.deposit();
                     System.out.println("--------------------------------------");
                    break;
                   case 3:
                     objAtm.withdraw();
                     System.out.println("--------------------------------------");
                    break;
                   case 4:
                   System.out.println("Account verified!");
                   System .out.println("Mini Statement");
                   System.out.println("---------------");
                    objAtm.ministatement();
                    System.out.println("--------------------------------------");
                    break;
                   case 5:
                    System.out.println("---------------------------------------------");
                    System.out.println("Collect your card.Thank you for using the ATM.");
                    System.out.println("Please visit us Again!");
                    scan1.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
             }
        }        
    }
}