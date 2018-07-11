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
		//ó��
		//��������� ���
		m.addAttribute("msg", "�ȳ��ϼ���~~~~");
		System.out.println("Controller......");
		//��������� ����
		return "result.jsp";
	}
	@RequestMapping("/second.do")
	public String byebye(Model m){
		//ó��
		//��������� ���
		m.addAttribute("msg", "�ȳ��ϼ���. �ι�° ������~~~");
		System.out.println("Controller �ι�°......");
		//��������� ����
		return "result.jsp";
	}
	
	@RequestMapping("/play.do")
	public String play(Model model) {
		model.addAttribute("msg", "���� �ð�");
		model.addAttribute("time", ""+(LocalDateTime.now().plusMinutes(10)));
		//��������� ����
		return "result.jsp";
	}
	
	@RequestMapping("/save.do")
	public String save(Model model, int num, String name) {
		// call save service
		model.addAttribute("msg", "num : "+num+", name : "+name);
		//��������� ����
		return "result.jsp";
	}
	@RequestMapping("/login.do")
	public String login(Model model, String id, String passwd, HttpSession session) {
		// call login service
		model.addAttribute("msg", "id : "+id);
		session.setAttribute("id", id);
		session.setAttribute("passwd", passwd);
		//��������� ����
		return "result.jsp";
	}
	
}
