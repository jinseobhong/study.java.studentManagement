import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class StudentRepositoryImpl implements StudentRepository {
    private final String url = "jdbc:mysql://localhost:3306/students";
    private final String username = "student";
    private final String password = "1234";

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepositoryImpl();
        repository.save(new Student(0, "홍길동", "과학"));
    }

    public List<Student> findAll() {
        List<Student> result = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("데이터 베이스 연결 성공!");
            //  sql 작성
            String sql = "select * from students";
            // sql 실행
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                result.add(new Student(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("major")
                        )
                );
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student findById(int id) {

        return null;
    }

    public void save(Student student) {
        // Connection 연결
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
//            System.out.println("데이터 베이스 연결 성공!");
            // insert sql 작성
            String sql = "insert into students (name, major) values (?,?)";
            // parameter 세팅
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, student.getName());
            statement.setString(2, student.getMajor());
            // sql 실행
            statement.executeUpdate();
            System.out.println("ㅇㅇㅇㅇ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Student updatedStudent) {

    }

    public void delete(int id) {

    }
}
