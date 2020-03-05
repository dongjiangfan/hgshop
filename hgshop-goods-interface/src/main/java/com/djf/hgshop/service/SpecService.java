package com.djf.hgshop.service;

import com.djf.hgshop.pojo.Spec;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: SpecService 
 * @Description: TODO
 * @author: 董江帆
 * @date: 2020年3月5日 下午3:41:44
 */
public interface SpecService {
	
	PageInfo<Spec> list(String name,int page);
	
	int add(Spec spec);
	
	int update(Spec spec);
	
	int delete(int id);
	
	/**
	 * 查找一个规格 用于修改时候的回显
	 * @param id
	 * @return
	 */
	Spec findById(int id);
	
	
	/**
	 * 批量删除
	 * @param id
	 * @return
	 */
	int deleteBatch(int[] id);
	
	
	
	
	
	
	
}
