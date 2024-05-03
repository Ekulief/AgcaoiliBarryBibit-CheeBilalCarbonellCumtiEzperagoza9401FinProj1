package prog2.fingrp;

import java.io.Serializable;

public class PreRequisites implements Serializable {
    private String courseNo;
    private String preRequisite1;
    private String getPreRequisite2;

    PreRequisites (String courseNo, String preRequisite1, String preRequisite2){
        this.courseNo = courseNo;
        this.preRequisite1 = preRequisite1;
        this.getPreRequisite2 = preRequisite2;
    }


    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public void setPreRequisite1(String preRequisite1) {
        this.preRequisite1 = preRequisite1;
    }

    public void setGetPreRequisite2(String getPreRequisite2) {
        this.getPreRequisite2 = getPreRequisite2;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public String getPreRequisite1() {
        return preRequisite1;
    }

    public String getGetPreRequisite2() {
        return getPreRequisite2;
    }
    //TINK OF SOMN
}
