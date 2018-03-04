package cn.xxh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.xxh.entity.Information;

@Repository("informationDao")
public interface InformationDao {
	public List<Information> find();
}
