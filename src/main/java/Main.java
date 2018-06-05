


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    List<Cat> list = new ArrayList<Cat>();
    public static void main(String[] args) throws IOException {
        List<Cat>  list = new ArrayList<>();
        HashMap <String, JSONObject> map = new HashMap <String,JSONObject>();
        String filename = new BufferedReader(new InputStreamReader(System.in)).readLine();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
HashMap<String,JSONObject>cars = new HashMap<>(jsonObject);
for (Map.Entry<String,JSONObject> item : cars.entrySet()){
    String key = item.getKey();
    JSONObject values = item.getValue();
   // int age = Integer.valueOf(String.valueOf(values.get("Cat")));
    JSONObject named = (JSONObject) values.get("murzik");
    String name1 = (String) named.get("name");
    System.out.println(name1);

    System.out.println(values);


}

/*
                ((Map<String, JSONObject>) jsonObject)
                    .entrySet()
                    .forEach(entry -> {
                        String key = entry.getKey();
                        JSONObject cat = entry.getValue();



      if (key.equals("murzik")){
       Cat cat1 = new Cat();

       int age1 = Integer.valueOf(String.valueOf(cat.get("age")));
           cat1.setParameters((String)cat.get("name"), age1);
          list.add(cat1);
      }
                      //  System.out.println(key);
                        System.out.println(cat.get("age"));
                        System.out.println(cat.get("name"));

                    });
*/
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
/*
        for (Cat o : list) {
            System.out.println(o.getName());
            System.out.println(o.getAge());
        }
*/
Main main = new Main();
        for (int i = 0; i <5 ; i++) {
          //  main.createCat();
           Cat cat = new Cat();
           list.add(cat);
        }
        System.out.println(list.isEmpty());
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }

    public void createCat(){
      Cat cat =  new Cat();
     // cat.setParameters("ddd",10);
        list.add(cat);
    }
}


