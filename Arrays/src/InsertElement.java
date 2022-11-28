import java.util.ArrayList;
import java.util.List;

public class InsertElement
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("red");
        list.add("green");
        System.out.println("present list: "+list);
        list.add(0,"pink");
        list.add(2,"white");
        System.out.println("After inserting : "+list);
    }
}
