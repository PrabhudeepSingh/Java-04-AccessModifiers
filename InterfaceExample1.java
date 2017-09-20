interface Interf1
{
  void m1();
}
interface Interf2
{
  void m2();
  int x=10;
}
interface Interf3 extends Interf1,Interf2
{
  void m3();
}
public class InterfaceExample1 implements Interf3
{
  public void m1()
  { 
    //x=100;  -> CE: cannot assign a value to final variable x
    System.out.println("first method");
    System.out.println(x);
  }
  public void m2()
  {
    System.out.println("second method");
  }
  public void m3()
  {
    System.out.println("third method");
  }
  public static void main(String[] args)
  {
    InterfaceExample1 e=new InterfaceExample1();
    e.m1();
    e.m2();
    e.m3();
  }
}
  

