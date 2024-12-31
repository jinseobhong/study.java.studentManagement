import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private final List<Student> students = new ArrayList<>();
    private int primaryKey = 1;

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(this.getStudents());
    }

    @Override
    public Student findById(int id) {
//        for(int i=0; i < this.getStudents().size(); i++) {
//            if(this.getStudents().get(i).getId() == id){
//                return this.getStudents().get(i);
//            }
//        }
        for (Student student : this.getStudents()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        student = new Student(this.primaryKey++, student.getName(), student.getMajor());
        this.getStudents().add(student);
    }

    @Override
    public void update(int id, Student updatedStudent) {
        if (this.findById(id) != null) {
            Student student = findById(id);
            student.setName(updatedStudent.getName());
            student.setMajor(updatedStudent.getMajor());
        }
    }

    @Override
    public void delete(int id) {
        for(int i =0; i < this.getStudents().size(); i++) {
            if(students.get(i).getId()== id) {
                this.getStudents().remove(i);
                break;
            }
        }
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public int getPrimaryKey() {
        return this.primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

}
