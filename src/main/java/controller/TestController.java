package controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import entity.Student;
import services.StudentService;

@Controller
@RequestMapping("/a")
@SessionAttributes(names = { "name" })
public class TestController {
	@Resource(name = "service2")
	private StudentService studentService;
	@RequestMapping("/b")
	public String b(ModelMap map) {
		System.out.println("gfgfgfgf");
		List<Student> list = studentService.queryStudent();
		for (Student student : list) {
			System.out.println(student);
		}
		map.put("stus", list);
		return "../index.jsp";
	}

	@RequestMapping("/c")
	public String insertStudent(Student stu) {
		System.out.println(stu);
		return "b";
	
	}

}
