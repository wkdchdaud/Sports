package sports.com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import sports.com.dto.TestDTO;
import sports.com.service.IComService;

@Controller
public class ComController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "ComService")
	private IComService comService;
	
	@RequestMapping("main")
	public String busimain(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) throws Exception {
		log.info("Wellcom user/usermain");
		log.info("Wellcom user/usermain");
		log.info("Wellcom user/usermain");
		log.info("Wellcom user/usermain");
		List<TestDTO> list = comService.getCommentList();
		model.addAttribute("list",list);
		return "/index";
	}
}