class Account{
int acc_id;
String acc_Name;
double acc_bal;
static double min_bal=2000;
static string branch_Name="SBI";
public static void main(String args[]){
new Account a1=new Account();
new Account a2=new Account();
new Account a3=new Account();

System.out.println(a1.acc_id);
System.out.println(a1.acc_Name);
}
}