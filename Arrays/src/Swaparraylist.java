import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swaparraylist
{
    public static void main(String[]args)
    {
        ArrayList<String> c1=new ArrayList<>();
        c1.add("thiru");
        c1.add("thimo");
        c1.add("thirumala");
        c1.add("thirumala rao");
        System.out.print("Before swap");
        for(String A:c1)
        {
            System.out.println(A);
        }
        Collections.swap(c1, 0,3);
        System.out.println("After swap");
        for(String B:c1)
        {
            System.out.println(B);

        }
     ArrayList<String>newc1= (ArrayList<String>)c1.clone();//cloan
        System.out.println("After cloaning: "+newc1);
        newc1.removeAll(newc1);//empty in the array list
        System.out.println("afterRemoving all elements : "+newc1);


    }
}
