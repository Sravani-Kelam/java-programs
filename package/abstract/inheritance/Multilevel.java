public class Grandparent {
    public void m1(){
        System.out.println("grandparent-m1");
}
    public void m2(){
        System.out.println("grandparent-m2");
    }
}
class Parent extends Grandparent{
     public void m3(){
        System.out.println("parent-m3");
     }
}
class child extends Parent{
   public void m4(){
    System.out.println("child-m4");
   } 
}
public class Multilevel{
    public static void main(String args[]){
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
    }
}
