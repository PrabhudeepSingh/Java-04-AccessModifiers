//Method Hiding

class StaticModifier6
{
  public static void main(String[] args)
  {
    System.out.println("parent class");
  }
}

class A extends StaticModifier6
{
   public static void main(String[] args)
  {
    System.out.println("child class");
  }
}
