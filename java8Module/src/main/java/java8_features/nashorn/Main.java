package java8_features.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");

        try {
            //        String script = "var welcome = 'Hi, I am a script'; welcome;";
            InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream("jsfile.js");
            Reader r = new InputStreamReader(resourceAsStream);
            Object eval = engine.eval(r);
            System.out.println(eval);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
