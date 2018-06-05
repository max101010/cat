

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonStreamParser;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReaderStr {
    String na = "./src/main/resources/new 1.json";
    InputStream is = new FileInputStream(na);
    Reader r = new InputStreamReader(is, "UTF-8");
    Gson gson = new GsonBuilder().create();
    JsonStreamParser p = new JsonStreamParser(r);
    Map m;
public void fgfg() {
    while (p.hasNext()) {
        JsonElement e = p.next();
        if (e.isJsonObject()) {
             m = gson.fromJson(e, Map.class);

            /* do something useful with JSON object .. */
        }
        /* handle other JSON data structures */
    }
}
    public ReaderStr() throws IOException {
    }
    List<Cat> list = new ArrayList();

   public void addd (){
     //  list.add(new Cat().setAge(10));
   }

}
