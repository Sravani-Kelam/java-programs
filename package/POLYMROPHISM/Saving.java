public class Saving {
    private double mib_bal;
    private int acc_id;
    private double acc_bal;
    public saving(int id,String name,double bal,String email){
        super(name,email);
        this.acc_id = id;
        this.acc_bal = bal;
    }
    public double getmin_bal(){
        return min_bal;
    }
    public void setmin_bal(double min_bal){
        this.min_bal = min_bal;
    }
    public double cal_bal(){
        double bal = this.acc_bal - this.getmin_bal();
        return bal;
    }
}
