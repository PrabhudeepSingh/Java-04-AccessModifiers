class Native
{
  static 
  {
    System.loadLibrary("native library path");
  }
  public native void m1();
}
class Client
{
  public static void main(String[] args)
  {
    Native n=new Native();
    n.m1();
  }
}
    