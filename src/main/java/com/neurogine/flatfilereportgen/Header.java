package com.neurogine.flatfilereportgen;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record
public class Header {

    @Field(at = 0, length = 1, rid = true)
    private String recordType = "H";

    @Field(at = 13, length = 15)
    private String fileType = "FLAT_FILE";

    // Getters and Setters
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}