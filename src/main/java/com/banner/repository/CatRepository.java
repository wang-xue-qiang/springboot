package com.banner.repository;

import org.springframework.data.repository.CrudRepository;

import com.banner.bean.Cat;

public interface CatRepository  extends CrudRepository<Cat, Integer>{

}
