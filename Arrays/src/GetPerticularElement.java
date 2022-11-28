import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GetPerticularElement
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("red");
        list.add("green");
        System.out.println("present list: "+list);
        list.add(0,"pink");//adding
        list.add(2,"white");
        System.out.println("After inserting : "+list);
         String string=list.get(2);//getting
        System.out.println(string);
        String colour= list.get(4);
        System.out.println(colour);
        list.remove(2);//removing
        System.out.println("after remove : "+list);
        if(list.contains("brown"))//search element
        {
            System.out.println("found element");
        }
        else
        {
            System.out.println("not found");
        }
        Collections.sort(list);//sorting elements
        System.out.println(list);
        Collections.shuffle(list);//shuffle elements
        System.out.println(list);
        Collections.reverse(list);//reverse element
        System.out.println(list);
        List<String> sublist=list.subList(0,3);//Extract a portion of a array list
        System.out.println(sublist);

    }
}
