package arrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
List<User> userList = new ArrayList<>();
User a = new User();
a.setNome("Alef");
a.setSobrenome("Guimel");
userList.add(a);

        Iterator<User> iter = userList.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }




    }
}
