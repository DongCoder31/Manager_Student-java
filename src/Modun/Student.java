package Modun;

import Interface.IStudent;
import Utils.Validate;

import java.util.List;
import java.util.Scanner;

public class Student implements IStudent {
    private int ID;
    private String fullName;
    private String dateofBrith;
    private String natives;
    private String classs;
    private String phoneNo;
    private int mobile;

    public Student(){
        super();
    }

    public Student(int ID, String fullName, String dateofBrith, String natives, String classs, String phoneNo, int mobile) {
        super();
        this.ID = ID;
        this.fullName = fullName;
        this.dateofBrith = dateofBrith;
        this.natives = natives;
        this.classs = classs;
        this.phoneNo = phoneNo;
        this.mobile = mobile;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateofBrith() {
        return dateofBrith;
    }

    public void setDateofBrith(String dateofBrith) {
        this.dateofBrith = dateofBrith;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void inputStudent(List<Student> studentList){
        Scanner scanner = new Scanner(System.in);
        this.ID = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        this.fullName = Validate.getString(scanner, "Enter full name: ");
        this.dateofBrith = Validate.getDay(scanner,"Enter Day follow dd/MM/yyyy :");
        this.classs = Validate.getString(scanner,"Enter Class: ");
        this.natives = Validate.getString(scanner,"Enter Native: ");
        this.phoneNo = Validate.getPhone(scanner,"Enter phone: ");
        this.mobile = Validate.getInt(scanner, "Enter moble: ");
    }

    @Override
    public void print() {
            System.out.println("ID : " + this.ID + "\t"
                    +"Name: " + this.fullName + "\t"
                    + "Brith: " + this.dateofBrith +"\t"
                    + "Native: " + this.natives +"\t"
                    + "Class: " + this.classs +"\t"
                    + "Phone: " + this.getPhoneNo() +"\t"
                    + "Mobile: " + this.mobile +"\t");
    }
}
