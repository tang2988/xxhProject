package cn.xxh.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.xxh.dao.InformationDao;
import cn.xxh.entity.Information;
import cn.xxh.service.InformationService;


@Service("informationService")
public class InformationServiceImpl implements InformationService{

	@Resource
	private InformationDao informationDao;
	

	@Override
	public Information getInformationBytitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
