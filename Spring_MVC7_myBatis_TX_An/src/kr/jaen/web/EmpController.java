package kr.jaen.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.jaen.spring.di.EmpService;
import kr.jaen.spring.di.Employee;

@Controller
public class EmpController {
	@Autowired
	EmpService ser;

	@RequestMapping("/empInput.do")
	public String empInput() {
		// return "redirect:/view/EmpInput.html";
		return "EmpInput";
	}

	@RequestMapping("/empList.do")
	public String empList(Model m) {
		m.addAttribute("list", ser.search());
		return "EmpList";// view/EmpList.jsp
	}

	@RequestMapping("/empSave.do")
	public String empSave(Employee e, Model m) {
		System.out.println("controller:" + e);
		ser.save(e);
		m.addAttribute("msg", "직원 등록 완료!!!");
		return "Result";
	}
	@RequestMapping("/salarySearch.do")
	@ResponseBody
	public Map<String,Integer> salarySearch(int snum){
		System.out.println("Controller:"+snum);
		int salary=ser.salarySearch(snum);
		System.out.println("Controller :"+salary);
		Map<String,Integer> m=new HashMap<>();
		m.put("salary",salary);
		return m;
	}

}
