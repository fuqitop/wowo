package util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu = new Student();
		stu.setSid(rs.getInt("sid"));
		stu.setName(rs.getString("name"));
		stu.setWeight(rs.getDouble("weight"));
		stu.setAge(rs.getInt("age"));
		stu.setBri(rs.getDate("bri"));
		return stu;
	}
}
