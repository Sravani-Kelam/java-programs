 abstract class A{
    abstract void m1();
}
class B extends A{
    public void m1(){
    }
    class Test{
    public static void main(String args[]){
        B b=new B();
        b.m1();
    }
 } 
}