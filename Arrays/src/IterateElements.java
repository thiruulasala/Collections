import java.util.ArrayList;
import java.util.List;

public class IterateElements
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("red");
        list.add("green");
    for(String elements:list)
    {
        System.out.println(elements);
    }
    }
}
