package services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import mapper.StudentDao;
import services.StudentService;

@Service("service1")
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentDao studenDao;

	@Override
	public List<Student> queryStudent() {
		System.out.println("studentService");
		return studenDao.queryStudent();
	}

}
