import java.util.ArrayList;
import java.util.List;

public class CopyOnLIstTOAnother
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("red");
        list.add("green");
        List<String>list1=new ArrayList<>(list);
        System.out.println(list1);
    }
}
