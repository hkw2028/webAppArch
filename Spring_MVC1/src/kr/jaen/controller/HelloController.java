package kr.jaen.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public String bye(Model m){
		//처리
		//결과데이터 담기
		m.addAttribute("msg", "안녕하세요~~~~");
		System.out.println("Controller......");
		//결과페이지 연동
		return "result.jsp";
	}
	@RequestMapping("/second.do")
	public String byebye(Model m){
		//처리
		//결과데이터 담기
		m.addAttribute("msg", "안녕하세요. 두번째 페이지~~~");
		System.out.println("Controller 두번째......");
		//결과페이지 연동
		return "result.jsp";
	}
	
	@RequestMapping("/play.do")
	public String play(Model model) {
		model.addAttribute("msg", "쉬는 시간");
		model.addAttribute("time", ""+(LocalDateTime.now().plusMinutes(10)));
		//결과페이지 연동
		return "result.jsp";
	}
	
	@RequestMapping("/save.do")
	public String save(Model model, int num, String name) {
		// call save service
		model.addAttribute("msg", "num : "+num+", name : "+name);
		//결과페이지 연동
		return "result.jsp";
	}
	@RequestMapping("/login.do")
	public String login(Model model, String id, String passwd, HttpSession session) {
		// call login service
		model.addAttribute("msg", "id : "+id);
		session.setAttribute("id", id);
		session.setAttribute("passwd", passwd);
		//결과페이지 연동
		return "result.jsp";
	}
	
}
