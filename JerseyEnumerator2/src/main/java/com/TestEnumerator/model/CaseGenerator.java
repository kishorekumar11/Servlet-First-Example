package com.TestEnumerator.model;

import java.io.File;

public class CaseGenerator{

    public static void generate(){
        String separator = System.getProperty("file.separator");
        String inputJsonPath = System.getProperty("user.dir")+separator+"conf"+separator+"inputJsonFile"+separator+"security.json";
        String outputDirLocation = System.getProperty("user.dir")+separator+"out"+separator+"outputJSON"+separator;
        new File(outputDirLocation+separator).mkdirs();
        JsonHandler.clearDirectory(outputDirLocation);
        JsonHandler.getJSON(inputJsonPath,outputDirLocation);
    }
}