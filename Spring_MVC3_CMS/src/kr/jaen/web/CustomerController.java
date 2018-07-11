package kr.jaen.web;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.jaen.spring.di.Customer;
import kr.jaen.spring.di.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	ICustomerService ser;
	
	@RequestMapping("/custInput.do")
	public String getCustomerInputTemplate() {
		return "CustInput";
	}
	
	@RequestMapping("/custSave.do")
	public String saveCustomerInformation(Customer customerInfo
											, @RequestParam(value="imgFileName") MultipartFile imgFileName
											, HttpServletRequest req
											, Model model) throws Exception{
		
		String imgUploadPath = req.getServletContext().getRealPath("/img");
		String fileName = imgFileName.getOriginalFilename().trim();
		File fileInstance = new File(imgUploadPath, fileName);
		imgFileName.transferTo(fileInstance);
		customerInfo.setImg(fileName);
		ser.save(customerInfo);
		model.addAttribute("msg", "success in save customer info");
		System.out.println(customerInfo);
		return "Result";
	}
	
	@RequestMapping("/custList.do")
	public String listCustomerInformation(Model model) {
		List<Customer> customerList = ser.search();
		model.addAttribute("list", customerList);
		return "CustList";
	}
	
	@RequestMapping("/custView.do")
	public String getSingleCustomerInformation(@RequestParam(required=true, value="num") int customerId, Model model) {
		Customer customerInfo = ser.search(customerId);
		model.addAttribute("result", customerInfo);
		return "CustView";
	}
	
}






