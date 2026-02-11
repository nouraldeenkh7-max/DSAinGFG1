import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>n=new ArrayList<>();
        n.add(3);
        n.add(4);
        Collections.swap(n,1,0);
        System.out.println(n);
    }
}