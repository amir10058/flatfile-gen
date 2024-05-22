package com.neurogine.flatfilereportgen;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Record
public class Trailer {

    @Field(at = 0, length = 1, align = Align.LEFT, literal = "T", rid = true)
    private String recordType = "T";

    @Field(at = 13, length = 15, align = Align.LEFT, literal = "FLAT_FILE")
    private String fileType = "FLAT_FILE";

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
