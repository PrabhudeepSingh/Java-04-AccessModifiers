abstract class AbstractExample
{
  /*public static void main(string args[])
  {
   AbstractExample a=new AbstractExample();  -> CE: Abstractexample is abstract; cannot be  instantiated
  }*/

  public abstract void m1()
  /*{
      CE:abstract methods cannot have a body
  }*/
}

public class AbstractExample1 extends AbstractExample
{
   public abstract void m1()
   {
     System.out.println("abstarct method");
   }
   public static void main()
   {
     AbstractExample e=new AbstractExample();
     e.m1();
   }
}