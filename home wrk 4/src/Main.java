import java.util.*;

public class Main {
    public static void main(String[] args) {


              String text = "6 8 6 6 7 2 1 5 4 2 8";


              Map<String, Integer> map = new TreeMap<>();

              String[] words = text.split("[\\s+\\p{P}]");
             for (int i = 0; i < words.length; i++) {
                    String key = words[i].toLowerCase();

                    if (key.length() > 0) {
                          if (!map.containsKey(key)) {
                                map.put(key, 1);
                              }
                          else {
                                int value = map.get(key);
                                value++;
                                map.put(key, value);
                              }
                        }
                  }


              map.forEach((k , v) -> System.out.println(k + "\t" + v));


    }
}