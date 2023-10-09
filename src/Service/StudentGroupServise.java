package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupServise {
    private StudentGroup studentGroup;
    private List <StudentGroup> studentGroups;
    
    public StudentGroupServise() {
        this.studentGroups = new ArrayList();
    }

    public Teacher CreateGroup(Teacher teacher, List<Student> students){
        studentGroup = new StudentGroup(teacher, students);
        studentGroups.add(studentGroup);
        return studentGroup.getTeacher();
    }
}
