package com.TestEnumerator.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.zeroturnaround.zip.ZipUtil;

import com.opensymphony.xwork2.ActionSupport;

import static java.io.File.separator;

@Results({
        @Result(name = "success", type = "stream",
                params = {
                "contentType","application/octet-stream",
                        "inputName","inputStream",
                        "contentDisposition","attachment;filename=\"${fileName}\"",
                        "bufferSize","10240"
        }),
        @Result(name = "error", location = "/error.jsp")
})

public class DownloadController extends ActionSupport {
    private InputStream inputStream;
    private String fileName;
    private long contentLength;

    private boolean deleteDirectory(File dir)
    {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDirectory(children[i]);
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    private void zipFolder(String zipDir)
    {
        ZipUtil.pack(new File(zipDir+separator), new File(zipDir+".zip"));
        new File(zipDir+".zip").deleteOnExit();
    }

    public String index() {
        String zipDir = System.getProperty("user.dir")+separator+"out";
        zipFolder(zipDir);
        File fileToDownload = new File(zipDir+".zip");

        try {
            inputStream = new FileInputStream(fileToDownload);
            fileName = fileToDownload.getName();
            contentLength = fileToDownload.length();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return ERROR;
        }
        deleteDirectory(new File(System.getProperty("user.dir")+separator+"conf"+separator+"inputJsonFile"));
        deleteDirectory(new File(System.getProperty("user.dir")+separator+"out"));
        return SUCCESS;
    }

    public long getContentLength() {
        return contentLength;
    }

    public String getFileName() {
        return fileName;
    }

    public InputStream getInputStream() {
        return inputStream;
    }
}
