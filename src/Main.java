import java.util.Arrays;

import Controler.Controler;
import Data.Teacher;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        
        Teacher teacher =new Teacher("22", "22", "22", "22",11);
        System.out.println(controler.CreateGroupOfStudent(teacher,(controler.GetAllStudent())));

    }
}