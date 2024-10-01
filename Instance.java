class Instance{
int a=100;
int b=89;
static int c=6789;
public static void main(String args[])
{
Instance i1=new Instance();
Instance i2=new Instance();
i2.b=30;
System.out.println(i1.a+i1.b+i1+c);
System.out.println(i2.a+i2.b+i2+c);
}
}