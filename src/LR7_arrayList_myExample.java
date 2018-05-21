import java.util.ArrayList;
import java.util.List;

public class LR7_arrayList_myExample {
    public static void main(String[] args) {
        List <String> olArray = new ArrayList <>();
        olArray.add("1st line"); //добавить значение
        olArray.add("2nd line");
        olArray.add("3rd line");
        olArray.add("3rd line");

        olArray.add(0, "newly added line at the top"); //добавить значение в самое начало
        System.out.println(olArray.get(1)); //показать значение по индексу
        System.out.println(olArray.indexOf("3rd line")); //узнать индекс по значению

        olArray.set(3, "changed 3rd line");
        System.out.println(olArray.get(3)); //изменила значение 4го элемента и вывела на экран

        olArray.remove(2); // удалила 2й элемент
        System.out.println(olArray);


    }
}
