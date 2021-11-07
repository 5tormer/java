package pr8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("element1");
        arrayList.add("element2");
        WaitList<String> waitList = new WaitList<>();
        waitList.add("wait1");
        waitList.add("wait2");
        waitList.add("wait3");
        System.out.println(waitList);
        System.out.println(waitList.remove());
        System.out.println(waitList);
        System.out.println(waitList.isEmpty());
        System.out.println(waitList.contains("wait4"));
        System.out.println(waitList.containsAll(arrayList));

    }
}
