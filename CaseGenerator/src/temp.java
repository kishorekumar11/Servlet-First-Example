import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;

public class temp {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\patch-junint-7\\Desktop\\newJson.json", "rw");
        long pos = randomAccessFile.length();
        System.out.println("Pos "+pos);
        while (randomAccessFile.length() > 0) {
            pos--;
            randomAccessFile.seek(pos);
            System.out.println(pos);
            if (randomAccessFile.readByte() == ']') {
                System.out.println("found it "+pos);
                randomAccessFile.seek(pos);
                System.out.println(pos);
                break;
            }
        }
        JSONArray arr = new JSONArray();
        arr.add(new LinkedHashMap<>());
        arr.add(new LinkedHashMap<>());
        String element = arr.toJSONString();
        System.out.println(element);
        element = element.substring(1,element.length()-1);


//        pos--;
//        randomAccessFile.seek(pos);
//        if(randomAccessFile.readByte() == '['){
//            pos++;
//            randomAccessFile.seek(pos);
//            randomAccessFile.writeBytes(element+"]\n}");
//        }
//        else {
//            pos++;
//            randomAccessFile.seek(pos);
//            randomAccessFile.writeBytes(",\n\t\t" + element + "]\n}");
//        }

        pos = 0;
        randomAccessFile.seek(pos);
        randomAccessFile.writeBytes("[\n{");
        pos = randomAccessFile.length();
        randomAccessFile.seek(pos-1);
        randomAccessFile.writeBytes("}\n]");
        randomAccessFile.close();
    }
}
