package Main;

import Modun.Student;

import java.util.ArrayList;
import java.util.List;

public class ManagerStudent {
    private List<Student> studentList = new ArrayList<>();

    public ManagerStudent(List<Student> studentList) {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    //add Student
    public void addStudent(){
        System.out.println("Enter Information Student:");
        Student student  = new Student();
        student.inputStudent(studentList);
        studentList.add(student);
    }

    public void showAllStudent(){
        System.out.println("List all student: ");
        for (Student st : studentList)
            st.print();
    }

    public void seachStudent(String seach){
        System.out.println("Seach Student by ID or Name");
        seach = seach.toLowerCase();
        int index = 0;

        for (Student st : studentList){
            int id = st.getID();
            String name = st.getFullName().toLowerCase();
            if (Integer.parseInt(seach) == id || name.contains(seach)) {
                st.print();
                index++;
            }

            if(index == 0)
                System.out.println("No matching results were found");
        }
    }






}
