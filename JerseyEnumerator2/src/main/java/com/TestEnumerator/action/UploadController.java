package com.TestEnumerator.action;

import com.TestEnumerator.model.CaseGenerator;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.io.File;
import java.io.IOException;

import static java.io.File.separator;

@Results(
        value = {
                @Result(name = "success", location = "/filedownload.jsp"),
        @Result(name = "error", location = "/error.jsp")
        })
public class UploadController extends ActionSupport {

    private File uploadFile;
    private String uploadFileContentType;
    private String uploadFileFileName;

    public File getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getUploadFileContentType() {
        return uploadFileContentType;
    }

    public void setUploadFileContentType(String uploadFileContentType) {
        this.uploadFileContentType = uploadFileContentType;
    }

    public String getUploadFileFileName() {
        return uploadFileFileName;
    }

    public void setUploadFileFileName(String uploadFileFileName) {
        this.uploadFileFileName = uploadFileFileName;
    }

    public String create() throws Exception{
        String destPath = System.getProperty("user.dir")+separator+"conf"+separator+"inputJsonFile"+separator;
        new File(destPath).mkdirs();
        try {
            File destFile  = new File(destPath, uploadFileFileName);
            FileUtils.copyFile(uploadFile, destFile);
        } catch(IOException e) {
            e.printStackTrace();
            return ERROR;
        }
        CaseGenerator.generate();
        return SUCCESS;
    }


}