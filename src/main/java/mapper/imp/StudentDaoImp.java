package mapper.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import entity.Student;
import mapper.StudentDao;
import util.StudentRowMapper;

@Repository
public class StudentDaoImp implements StudentDao {
	@Autowired 
	private JdbcTemplate template;

	@Override
	public List<Student> queryStudent() {
		List<Student> list = template.query("select * from student", new StudentRowMapper());
		return list;
	}

}
