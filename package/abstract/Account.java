abstract class Account {
    public void open_acc(){
        System.out.println("acc opened");
    }
    public abstract int get_bal();
}
class SA extends Account{
    public int get_bal(){
        return 289;
    }
    public static void main(String[] args){
        SA obj=new SA();
        obj.open_acc();
        int bal=obj.get_bal();
        System.out.println(bal);
    }
}
