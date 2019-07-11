import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;

public class new_temp {

    public static void func(JSONArray brr){
        brr.add("hemanth");
    }

    public static void main(String[] args) throws IOException {
//        ObjectMapper mapperMain=new ObjectMapper();
//        ObjectWriter writer = mapperMain.writer(new DefaultPrettyPrinter());
//        File fileName = new File("C:\\Users\\patch-junint-7\\Desktop\\temp\\temp.json");
//        LinkedHashMap obj = new LinkedHashMap();
//
//        LinkedHashMap template = new LinkedHashMap();
//        template.put("name","String");
//        template.put("age","int");
//
//        JSONObject example = new JSONObject();
//        example.put("name","kishore");
//        example.put("age",21);
//
//        JSONArray testCase = new JSONArray();
//        testCase.add(example);
//
//        obj.put("Link","abc/sdfas/sfasd/");
//        obj.put("Template",template);
//        obj.put("testCases",testCase);
//        writer.writeValue(new FileWriter(fileName,false),obj);
        JSONObject obj = new JSONObject();
        obj.put("arr",new JSONArray());
        ( (JSONArray) obj.get("arr")).add("kishore");
        System.out.println(obj);
        JSONArray arr = (JSONArray) obj.get("arr");
        System.out.println(arr);
        func(arr);
        System.out.println(obj);

    }
}

