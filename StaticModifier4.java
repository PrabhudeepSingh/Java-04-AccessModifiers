public class StaticModifier4
{

  public static void main(String[] args)
  {
    System.out.println("String []");//String []       -> JVM always call String[] args main method only
  }

  public static void main(int[] args)
  {
    System.out.println("int []");
  }
}