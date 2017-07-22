package com.banner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banner.bean.Cat;
import com.banner.dao.CatDao;
import com.banner.repository.CatRepository;

@Service
public class CatService {
	@Autowired
	private CatRepository catRepository;
	
	@Autowired
	private CatDao catDao;
	
	@Transactional
	public void save(Cat cat){
		catRepository.save(cat);
	}
	@Transactional
	public void delete(Integer id){
		catRepository.delete(id);
	}

	public Iterable<Cat> getAll(){
		return catRepository.findAll();
	}
	public Cat selectByName(String name){
		return catDao.selectByCatName(name);
	}
}