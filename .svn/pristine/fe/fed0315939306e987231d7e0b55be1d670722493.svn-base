package egovframework.example.welcomeWeb1.service.impl;

import java.util.List;
import java.util.Map;

import egovframework.example.welcomeWeb1.service.WelcomeWeb1VO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("welcomeWeb1Mapper")
public interface WelcomeWeb1Mapper {
	
	@SuppressWarnings("rawtypes")
	List<Map> pieChartList() throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListString(String age) throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListMap(Map map) throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListEgovMap(EgovMap egovMap) throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> tableListVO(WelcomeWeb1VO vo) throws Exception;
	
}
