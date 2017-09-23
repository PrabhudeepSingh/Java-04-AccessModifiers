public class StaticModifier1
{
   static int x;
   //final static int y; -> CE: variable y not initialized
   final static int y=10;
   static int z=20;
   static int x1;
   static 
   {
     x1=30;
   }
 
   public static void main(String[] args)
   {
      System.out.println(x);    
      System.out.println(StaticModifier1.y); 
      System.out.println(StaticModifier1.z); 
      System.out.println(StaticModifier1.x1);
   }
}
  