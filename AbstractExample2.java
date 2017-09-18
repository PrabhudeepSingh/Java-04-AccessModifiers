abstract class AbstractExample
{
  /*public static void main(string args[])
  {
     AbstractExample a=new AbstractExample(); ->  CE: AbstractExample is abstract; cannot be  instantiated
  }*/

  public abstract void m1();
  /*{
      CE:abstract methods cannot have a body
  }*/
}

public class AbstractExample2 extends AbstractExample
{
   public void m1()
   {
     System.out.println("abstarct method");
   }

   public static void main(String args[])
   {
     AbstractExample2 e =new AbstractExample2();
     e.m1();
   }
}