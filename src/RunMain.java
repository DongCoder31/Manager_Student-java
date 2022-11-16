import Main.ManagerStudent;
import Modun.Student;
import Utils.Menu;
import Utils.Validate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        ManagerStudent mn = new ManagerStudent(studentList);
        int i;

        do {
            Menu.menu();
            do {
                i = Validate.getInt(scanner,"Choice: ");
                if ((i < 1) || (i > 4))
                    System.out.println("Enter a number from 1 to 6");
            } while ((i < 1) || (i > 4));

            switch (i) {
                case 1-> {
                    mn.addStudent();
                    System.out.println();
                }
                case 2 -> {
                    mn.showAllStudent();
                    System.out.println();
                }
                case 3 -> {
                    String st ;
                    st = Validate.getString(scanner,"Enter Keyword: ");
                    mn.seachStudent(st);
                    System.out.println();
                }
                case 4 -> System.out.println("Program is finished");
            }
        } while (i != 4);
    }
}