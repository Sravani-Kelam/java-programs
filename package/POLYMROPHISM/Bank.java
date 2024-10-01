public class Bank{
    public abstract double cal_bal();
}
public class Account extends Bank{
 public void  cal_bal(){}
 private String Acc_name;
 private String Acc_mail;
}