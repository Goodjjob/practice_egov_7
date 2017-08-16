package egovframework.example.welcomeWeb2.web;

import java.util.ArrayList;
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

import egovframework.example.welcomeWeb2.service.WelcomeWeb2Service;
import egovframework.example.welcomeWeb2.service.WelcomeWebVO2;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class WelcomeWeb2Controller {

	@Resource(name = "welcomeWeb2Service")
	WelcomeWeb2Service welcomeWeb2Service;
	
	@RequestMapping(value = "string2.do" )
	public String requestString2(HttpServletRequest request, ModelMap model) throws Exception { 
		
		String age = request.getParameter("age");
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListString(age);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
	
		return "welcomeWeb2/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "map2.do" )
	public String requestMap2(HttpServletRequest request, ModelMap model) throws Exception { 
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("age", request.getParameter("age"));
		map.put("age2", request.getParameter("age2"));

		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListMap(map);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
	
		
		return "welcomeWeb2/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "egoMap2.do" )
	public String requestEgovMap2(HttpServletRequest request, ModelMap model) throws Exception { 
		
		EgovMap egovMap = new EgovMap(); 
		
		egovMap.put("age", request.getParameter("age"));
		egovMap.put("age2", request.getParameter("age2"));

		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListEgovMap(egovMap);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		return "welcomeWeb2/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "vo2.do" )
	public String requestVO2(HttpServletRequest request, ModelMap model) throws Exception { 
		
		WelcomeWebVO2 vo = new WelcomeWebVO2();
		
		vo.setCountry(request.getParameter("country"));

		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListVO(vo);
		
		List<Map> hanqList = new ArrayList(); 
		
		for(Map a : tableList) { 
			if(a.get("username").equals("한큐")) { 
				hanqList.add(0, a);
			}
		}
		
		
		for(int i=0; i<tableList.size(); i++) { 
			if(tableList.get(i).containsValue("한큐"))
				System.out.println("한큐발견");
		}
	
		
		model.addAttribute("pieChartList", pieChartList);
		
		
	
	
		return "welcomeWeb2/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "requestParam2.do" )
	public String requestRequestParam2(@RequestParam String country, ModelMap model) throws Exception { 
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListString(country);
		
		
		
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
		
		
		return "welcomeWeb2/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "modelAttribute2.do" )
	public String requestModelAttribute2(@ModelAttribute("vo") WelcomeWebVO2 vo, ModelMap model) throws Exception { 
		
		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListVO(vo);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
	
		
		return "welcomeWeb2/welcomeWeb.tiles";
	}
	
	@RequestMapping(value = "haveNotAnnotationModelAttribute2.do" )
	public String haveNotRequestModelAttribute2(WelcomeWebVO2 welcomeWebVO2, ModelMap model) throws Exception { 

		@SuppressWarnings("rawtypes")
		List<Map> pieChartList 	= this.welcomeWeb2Service.pieChartList();
		
		@SuppressWarnings("rawtypes")
		List<Map> tableList		= this.welcomeWeb2Service.tableListVO(welcomeWebVO2);
		
		model.addAttribute("pieChartList", pieChartList);
		model.addAttribute("tableList", tableList);
	
		return "welcomeWeb2/welcomeWeb.tiles";
	}
}
