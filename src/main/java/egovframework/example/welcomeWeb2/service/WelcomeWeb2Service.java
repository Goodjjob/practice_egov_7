package egovframework.example.welcomeWeb2.service;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface WelcomeWeb2Service {

	@SuppressWarnings("rawtypes")
	List<Map> pieChartList() throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListString(String age) throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListMap(Map map) throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListEgovMap(EgovMap egovMap) throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListVO(WelcomeWebVO2 vo) throws Exception;
	
}
