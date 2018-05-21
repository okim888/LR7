import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LR7_hashMap_myExample {
    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        String first = states.get(2); // получила объект по ключу 2
        System.out.println(first);

        Set<Integer> keys = states.keySet(); // получила весь набор ключей

        Collection<String> values = states.values(); // получила набор всех значений

        states.replace(1, "Poland"); //заменила элемент

        states.remove(2); // удалила элемента по ключу 2

        // перебор элементов
        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}
