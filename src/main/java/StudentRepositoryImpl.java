import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class StudentRepositoryImpl implements StudentRepository {
    private final String url = "jdbc:mysql://localhost:3306/students";
    private final String username = "student";
    private final String password = "1234";

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();

        return students;
    }

    public Student findById(int id) {

        return null;
    }

    public void save(Student student) {

    }

    public void update(int id, Student updatedStudent) {

    }

    public void delete(int id) {

    }
}
