import java.util.*;
import java.sql.*;
public class ImportExample3
{
  public static void main(String []args)
  {
    Date d=new Date(); //CE: reference to Date is ambiguous(both class java.sql.Date in java.sql and class java.util.Date in java.util matches).
  }
}