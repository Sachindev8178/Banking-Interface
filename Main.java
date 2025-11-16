public class Main {
    public static void main(String[] args) {
        CaneraBank SachinAccount=new CaneraBank("Sachin kumar","abc",1000);
        System.out.println(SachinAccount.getAccountNo());
        SachinAccount.deposit(30000);
        System.out.println(SachinAccount.checkBalance("abc"));
        SachinAccount.withdraw(25000,"abc");
        SachinAccount.withdraw(4000,"abc");

        SachinAccount.changePassword("abc","sachin@123");
        System.out.println(SachinAccount.deposit(10000));

        System.out.println(SachinAccount.calculateInterest(3));
        System.out.println(SachinAccount.getHolderName());
        System.out.println(SachinAccount.checkBalance("sachin@123"));


        //This is Raja Babu Account and his all transection here

        Sbi RajaBabu=new Sbi("Raja Babu Kumar","raja@123",20000);
        System.out.println(RajaBabu.getAccountNumber());

        RajaBabu.deposit(40000);
        System.out.println(RajaBabu.deposit(3000));
        System.out.println(RajaBabu.getRateOfInterset());

        RajaBabu.withdraw(43000,"raja@123");

        RajaBabu.changePassword("raja@123","Raja@7739");
        System.out.println(RajaBabu.deposit(5000));
        RajaBabu.withdraw(2300,"Raja@7739");
    }
}
