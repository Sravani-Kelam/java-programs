class Parent{
   parent(String mname,String fname){
    System.out.println("");
   }
}
class Child extends Parent{
    child(String myname,String friendname){
        super(friendname);
        System.out.println("child class constructor");
    }
}
public class Test2{
    public static void main(String args[]){
        new Child("sri","siri")
    }
}
