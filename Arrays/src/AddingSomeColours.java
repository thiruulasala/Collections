import java.util.ArrayList;
import java.util.List;

public class AddingSomeColours
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("blue");
        list.add("red");
        list.add("green");
        System.out.println("colour's list :"+list);
       String newlist="Black";
       list.set(1,newlist);
       int num=list.size();
       System.out.println("after replacing");
       for(int i=0;i<num;i++)
       {
           System.out.println(list.get(i));
       }
    }

}
