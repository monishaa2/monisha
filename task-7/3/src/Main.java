import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(65);
        list.add(13);
        list.add(85);
        list.add(98);
        System.out.println("before updation " +list);
        list.add(0,100);
        System.out.println("after updation" +list);


    }
}