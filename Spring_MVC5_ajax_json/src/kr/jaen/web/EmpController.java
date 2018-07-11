package kr.jaen.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	public String empSave(Employee e, @RequestParam("iname") MultipartFile mFile, HttpServletRequest req, Model m) throws IllegalStateException, IOException{
		System.out.println("controller:"+e);
		String fName=mFile.getOriginalFilename().trim();
		String path=req.getServletContext().getRealPath("/img");
		System.out.println("경로:"+path);
		File f=new File(path,fName);
		mFile.transferTo(f);
		
		e.setImg(fName);
		System.out.println("Controller:"+e);
		ser.save(e);
		m.addAttribute("msg", "직원 등록 완료!!!"+e);
		return "Result";
	}

	@RequestMapping("/empSearch.do")
	@ResponseBody
	public Employee empSearch(int snum){
		System.out.println("controller:"+snum);
		Employee e=ser.search(snum);
		System.out.println("search:"+e);
		return e;
	}

}






