package com.eshan.collectionFramework;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable <Code>{
    private String lectureNo;
    private String sectionNo;

    public Code(String lectureNo, String sectionNo) {
        this.lectureNo = lectureNo;
        this.sectionNo = sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "lectureNo='" + lectureNo + '\'' +
                ", sectionNo='" + sectionNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.sectionNo.concat(o.lectureNo);
        return  code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(lectureNo, code.lectureNo) && Objects.equals(sectionNo, code.sectionNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectureNo, sectionNo);
    }
}
public class TreeMapClass {
    public static void main(String[] args) {
        Map<Code, String> map = new TreeMap<>();
        map.put(new Code("L01","SO3"),"Object Oriented Programming");
        map.put(new Code("L01","SO3"),"Computer Organization And Architecture");
        map.put(new Code("L04","SO6"),"Computer Networks");
        map.put(new Code("L05","SO4"),"Compiler Design");
        map.put(new Code("L03","SO9"),"Database Management System");
        map.put(new Code("L07","SO1"),"Operating System");
        for(Map.Entry<Code, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        Code code1 = new Code("L01","SO3");
        Code code2 = new Code("L01","SO3");
        System.out.println(code1.hashCode()+" "+code2.hashCode());
        System.out.println(code1.equals(code2));
        System.out.println(code1 == code2);

        // Searching for the key of value Compiler Design
        for(Map.Entry<Code, String> entry : map.entrySet()){
            if(entry.getValue().equals("Compiler Design")){
                System.out.println("Key of \"Compiler Design \""+entry.getKey());
            }
        }
    }
}
