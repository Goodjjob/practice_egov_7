package egovframework.example.welcomeWeb1.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.welcomeWeb1.service.WelcomeWeb1Service;
import egovframework.example.welcomeWeb1.service.WelcomeWeb1VO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("welcomeWeb1Service")
public class WelcomeWeb1ServiceImpl extends EgovAbstractServiceImpl implements WelcomeWeb1Service {

	@Resource(name = "welcomeWeb1Mapper")
	private WelcomeWeb1Mapper welcomeWeb1Mapper;

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> pieChartList() throws Exception {
		
		return this.welcomeWeb1Mapper.pieChartList();
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> tableListString(String age) throws Exception {
		
		return this.welcomeWeb1Mapper.tableListString(age);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> tableListMap(Map map) throws Exception {
		
		return this.welcomeWeb1Mapper.tableListMap(map);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> tableListEgovMap(EgovMap egovMap) throws Exception {
		
		return this.welcomeWeb1Mapper.tableListEgovMap(egovMap);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> tableListVO(WelcomeWeb1VO vo) throws Exception {
		
		return this.welcomeWeb1Mapper.tableListVO(vo);
	}

}
