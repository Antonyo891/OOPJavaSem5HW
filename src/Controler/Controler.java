package Controler;

import Data.Type;
import Data.User;
import Data.Student;
import Data.Teacher;
import Service.DataService;
import Service.StudentGroupServise;
import View.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentGroupServise groupServise = new StudentGroupServise();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void ViewAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

        public List<Student> GetAllStudent(){
        List<Student> userList = new ArrayList<>();
        for (User items :service.getAllStudent()) userList.add((Student)items);
        return userList;
    }

    public List<Integer> CreateGroupOfStudent (Teacher teacher, List<Student> students){
        List<Integer> result = new ArrayList<>();
        groupServise.CreateGroup(teacher, students);
        result.add(teacher.getTeacherId());
        for (Student items: students) result.add(items.getStudentId());
        return result;
    }
}
