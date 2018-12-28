package com.binron.multidatasource.service;

import java.util.List;

/**
 *
 * 数据层公共实现接口
 */
public interface BaseService<T> {

	/**
	 * 插入数据
	 */
	 boolean insert(T entity) ;
	
	/**
	 * 更新数据
	 */
	 boolean update(T entity) ;
	
	/**
	 * 根据ID删除数据
	 */
	 boolean deleteByPrimaryKey(int id) ;
	
	/**
	 * 删除数据
	 */
	 boolean delete(T entity) ;
	
	
	/**
	 * 根据id查询单个记录
	 */
	 T findByPrimaryKey(int id);
	
	/**
	 * 根据对象查询单个记录
	 */
	 T findByEntity(T entity);

	/**
	 * 根据对象查询多条记录
	 */
	 List<T> findByListEntity(T entity);
	
	/**
	 * 查询所有记录
	 */
	 List<T> findAll();
	 
	/**
	 * 根据对象查询信息
	 */
	 Object findByObject(Object obj);
}
