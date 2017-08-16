package egovframework.example.welcomeWeb2.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.welcomeWeb2.service.WelcomeWeb2Service;
import egovframework.example.welcomeWeb2.service.WelcomeWebVO2;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("welcomeWeb2Service")
public class WelcomeWeb2ServiceImpl extends EgovAbstractServiceImpl implements WelcomeWeb2Service {

	@Resource(name = "welcomeWeb2Mapper")
	WelcomeWeb2Mapper welcomeWeb2Mapper;
	
	@Override
	public List<Map> pieChartList() throws Exception {
		
		return this.welcomeWeb2Mapper.pieChartList();
	}

	@Override
	public List<Map> tableListString(String age) throws Exception {
		
		return this.welcomeWeb2Mapper.tableListString(age);
	}

	@Override
	public List<Map> tableListMap(Map map) throws Exception {
		
		return this.welcomeWeb2Mapper.tableListMap(map);
	}

	@Override
	public List<Map> tableListEgovMap(EgovMap egovMap) throws Exception {
		
		return this.welcomeWeb2Mapper.tableListEgovMap(egovMap);
	}

	@Override
	public List<Map> tableListVO(WelcomeWebVO2 vo) throws Exception {
		
		return this.welcomeWeb2Mapper.tableListVO(vo);
	}

}
