import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayLists
{
    public static void main(String[]args)
    {
    ArrayList<String> c1=new ArrayList<String>();
    c1.add("blue");
    c1.add("ball");
    c1.add("bench");
    c1.add("black");


        ArrayList<String> c2=new ArrayList<String>();
        c2.add("car");
        c2.add("card");
        c2.add("coffe");
        c2.add("black");

        ArrayList<String> c3=new ArrayList<String>();
      for(String D:c1)
      {
          c3.add(c2.contains(D)? "Yes": "No");
          System.out.println(c3);
      }
      List<String>JOin=new ArrayList<>();
      JOin.addAll(c1);//Join two arraylists
      JOin.addAll(c2);
      System.out.print(JOin);
    }
}
