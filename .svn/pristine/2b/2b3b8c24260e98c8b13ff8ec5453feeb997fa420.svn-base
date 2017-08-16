package egovframework.example.welcomeWeb2.service.impl;

import java.util.List;
import java.util.Map;

import egovframework.example.welcomeWeb2.service.WelcomeWebVO2;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("welcomeWeb2Mapper")
public interface WelcomeWeb2Mapper {

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
