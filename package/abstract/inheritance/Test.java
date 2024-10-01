class Account{
    String acc_name;
    String acc_email;
   Account(String name,String email){
    this.acc_name=name;
    this.acc_email=email;
   }
}
class Saving{
    int acc_bal;
    double acc_bal;
    static double min_bal=500;
   Saving(int id,String name,double bal,String email){
    super(name,email);
    this.acc_id= id;
    this.acc_bal= bal;

   }
}
class Test{
    public static void main(String args[])
    new Saving(id:25,name:"sri",bal:67890,email:"sri@gmail.com");
}
