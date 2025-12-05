import java.util.HashMap;

import java.util.Map;

public class Demo{

    public static void main(String args[]){
        System.out.println("hello world");
        String value="Dayanand";
        System.out.println(value.length());
        Map<Character, Integer> ch=new HashMap<>();
        ch.put('h',2);
        ch.put('e',2);
        ch.put('l',2);
        ch.put('l',2);
        ch.put('o',2);
    }
}