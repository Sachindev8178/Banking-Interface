import java.util.UUID;

public class Sbi implements Bankaccount {

    private String AccountNumber;
    private String HolderName;
    private String Password;
    private int Balance;
    private final double RateOfInterset;

    //Constructor
    Sbi(String HolderName,String Password,int Balance){
        this.AccountNumber=String.valueOf(UUID.randomUUID());
        this.HolderName=HolderName;
        this.Password=Password;
        this.Balance=Balance;
        this.RateOfInterset=5.7;

    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getHolderName() {
        return HolderName;
    }

    public double getRateOfInterset() {
        return RateOfInterset;
    }

    public void setHolderName(String holderName) {
        this.HolderName = holderName;
    }

    @Override
    public double checkBalance(String password) {
        if(this.Password.equals(password)){
            return this.Balance;
        }
        return -1;
    }

    @Override
    public int deposit(int amount) {
        this.Balance+=amount;
        return this.Balance;
    }

    @Override
    public void withdraw(int amount, String password) {
        if(!this.Password.equals(password)){
            System.out.println("Wrong Password");
            return;
        }
        if(amount > this.Balance){
            System.out.println("Insufficient Balance");
            return;
        }
        this.Balance-=amount;
        System.out.println("Your Final Balance is = "+this.Balance);
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if(!this.Password.equals(oldPassword)){
            System.out.println("Your Current Password is Wrong");
            return;
        }
        this.Password=newPassword;
        System.out.println("Your Password Changed Successfully");
    }

    @Override
    public double calculateInterest(int years) {
        return(this.Balance*this.RateOfInterset*years)/100.0;
    }
}
