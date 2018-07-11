package kr.jaen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.jaen.spring.di.EmpService;
import kr.jaen.spring.di.Employee;

@Controller
public class EmpController {
	@Autowired
	EmpService ser;
	
	@RequestMapping("/empInput.do")
	public String empInput(){
		//return "redirect:/view/EmpInput.html";
		return "EmpInput";
	}
	
	@RequestMapping("/empList.do")
	public String empList(Model m){
		m.addAttribute("list", ser.search());
		return "EmpList";//view/EmpList.jsp
	}
	@RequestMapping("/empSave.do")
	public String empSave(Employee e, Model m){
		System.out.println("controller:"+e);
		ser.save(e);
		m.addAttribute("msg", "저장 성공!!!");
		return "Result";
	}
	
	@RequestMapping("/view.do")
	public  String empView(int snum, Model m) {
		Employee e=ser.search(snum);
		m.addAttribute("result", e);
		return "EmpView";
	}
	
	
	
	
	
	
	
	/* @RequestMapping("/empSave.do")
	 * public String empSave(int snum, 
	   						 String sname, 
							@RequestParam("sal") int salary, Model m){
		ser.save(new Employee(snum, sname, salary));
		m.addAttribute("msg", "���� ��� �Ϸ�!!!");
		return "Result";
	}*/
	
}






