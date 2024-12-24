import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

class StudentRepositoryImpl implements StudentRepository {
    private final SqlSessionFactory sqlSessionFactory;

    public StudentRepositoryImpl() {
        InputStream inputStream = StudentManagementApp.class.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public List<Student> findAll() {
        return null;
    }

    public Student findById(int id) {
        return null;
    }

    public void save(Student student) {

    }

    public void update(Student student) {

    }

    public void delete(int id) {

    }
}
