interface DaoI{
    public abstract void login();    
    public abstract void logout();    
}
interface USI{
      public abstract void forgotpassword();
}
class DaoImpl implements DaoI,USI{
      public void login(){
        System.out.println("login success");
      }
      public void logout(){
        System.out.println("logout successful");
      }
      public void forgotpassword(){
        System.out.println("password updated successfully");
      }
}
public class Multiple{
    public static void main(String args[]){
    DaoI obj=new DaoImpl();
        obj.login();
        obj.logout();
        obj.forgotpassword();
    }
}
