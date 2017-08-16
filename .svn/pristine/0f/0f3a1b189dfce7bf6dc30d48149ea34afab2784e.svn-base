package egovframework.example.welcomeWeb1.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.welcomeWeb1.service.WelcomeWeb1Service;
import egovframework.example.welcomeWeb1.service.WelcomeWeb1VO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class WelcomeWeb1Controller {
	
	@Resource(name = "welcomeWeb1Service")
	private WelcomeWeb1Service welcomeWeb1Service;
	
	@RequestMapping(value = "string1.do" )
	public String requestString(HttpServletRequest request, ModelMap model) throws Exception { 
		
		String age = request.getParameter("age");
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListString(age);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		return "welcomeWeb1/welcomeWeb.tiles";
	
	}
	
	@RequestMapping(value = "map1.do" )
	public String requestMap(HttpServletRequest request, ModelMap model) throws Exception { 
		
		HashMap<String, Object> resMap = new HashMap<String, Object>();
		
		resMap.put("age", request.getParameter("age"));
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListMap(resMap);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		return "welcomeWeb1/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "egoMap1.do" )
	public String requestEgovMap(HttpServletRequest request, ModelMap model) throws Exception { 
		
		EgovMap egovMap = new EgovMap();
		
		egovMap.put("age", request.getParameter("age"));
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();

		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListEgovMap(egovMap);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		return "welcomeWeb1/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "vo1.do" )
	public String requestVO(HttpServletRequest request, ModelMap model) throws Exception {
		
		WelcomeWeb1VO vo = new WelcomeWeb1VO();
		
		vo.setAge(request.getParameter("age"));
		vo.setAge2(request.getParameter("age2"));
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListVO(vo);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		return "welcomeWeb1/welcomeWeb.tiles";
	}
	
	
	@RequestMapping(value = "requestParam1.do")
	public String requestVoRequestParam(@RequestParam String age, String age2, ModelMap model) throws Exception { 
		
		System.out.println(age);
		System.out.println(age2);
		
		EgovMap egovMap = new EgovMap(); 
		
		egovMap.put("age", age);
		egovMap.put("age2", age2);
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();
	
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListEgovMap(egovMap);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		
		return "welcomeWeb1/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "modelAttribute1.do")
	public String modelAttribute(@ModelAttribute("vo") WelcomeWeb1VO vo, ModelMap model) throws Exception {
		
		System.out.println(vo.getAge());
		System.out.println(vo.getAge2());
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("age", vo.getAge());
		map.put("age", vo.getAge2());
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListMap(map);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
	
		return "welcomeWeb1/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "haveNotAnnotationModelAttribute1.do")
	public String haveNotModelAttribute(WelcomeWeb1VO welcomeWeb1VO, ModelMap model) throws Exception {
		
		System.out.println(welcomeWeb1VO.getAge());
		System.out.println(welcomeWeb1VO.getAge2());
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("age", welcomeWeb1VO.getAge());
		map.put("age", welcomeWeb1VO.getAge2());
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb1Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb1Service.tableListMap(map);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
	
		return "welcomeWeb1/welcomeWeb.tiles";
	}
	
}
