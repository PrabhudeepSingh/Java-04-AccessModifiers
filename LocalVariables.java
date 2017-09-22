public class LocalVariables
{  
  public static void main(String[] args)
  {
    int x;
    final int y;
    final int z=10;

    //public int y=10;                  ->CE: illegal start of expression
    //private int y=10;                 ->CE: illegal start of expression
    //static int y=10;                  ->CE: illegal start of expression
    //volatile int y=10;                ->CE: illegal start of expression
    //transient int y=10;               ->CE: illegal start of expression
    //protected int y=10;               ->CE: illegal start of expression

    System.out.println("hello");
    System.out.println(z);

    //System.out.println(y);           ->CE: variable y might not have been initialized
    //System.out.println(x);           ->CE: variable x might not have been initialized

    m1(10,30);
  }

   public static void m1(final int a,int b)
   {
     //a=100;                          ->CE: cant't assign a value to final variable
     //b=200;                          ->CE: cant't assign a value to final variable
     System.out.println(a);
     System.out.println(b);
   }
}