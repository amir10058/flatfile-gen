package com.neurogine.flatfilereportgen;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Record
public class Body {
    @Field(at = 19, length = 10, align = Align.LEFT)
    private String referenceNo;

    @Field(at = 39, length = 10, align = Align.LEFT)
    private String amount;

    public Body(String referenceNo, String amount) {
        this.referenceNo = referenceNo;
        this.amount = amount;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}