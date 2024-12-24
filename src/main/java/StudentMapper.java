import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
interface StudentMapper {

    List<Student> findAll();


    Student findById(int id);


    void save(Student student);


    void update(Student student);


    void delete(int id);
}