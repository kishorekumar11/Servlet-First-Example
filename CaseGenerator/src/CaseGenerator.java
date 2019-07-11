
public class CaseGenerator{

    public static void main(String[] args){

        String separator = System.getProperty("file.separator");
        String inputJsonPath = System.getProperty("user.dir")+separator+"conf"+separator+"JSONfile"+separator+"security.json";
        String outputDir = System.getProperty("user.dir")+separator+"out"+separator+"outputJSON";

        JSON_Class.clearDirectory(outputDir);
        JSON_Class.getJSON(inputJsonPath,outputDir);

    }
}
