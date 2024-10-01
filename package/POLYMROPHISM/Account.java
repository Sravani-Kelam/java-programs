public class Account extends Bank{
    private String acc_name;
    private String acc_email;
    public Account(String name, String email){
        this.acc_name = name;
        this.acc_email = email;
    }
    public double cal_bal(){
        return 0.0;
    }
    
}
