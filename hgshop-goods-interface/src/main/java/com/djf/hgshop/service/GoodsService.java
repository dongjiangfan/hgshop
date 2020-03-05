package com.djf.hgshop.service;

import java.util.List;

import com.djf.hgshop.pojo.Brand;
import com.djf.hgshop.pojo.Category;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: GoodsService 
 * @Description: TODO
 * @author: 董江帆
 * @date: 2020年3月5日 下午3:41:25
 */
public interface GoodsService { 
	
	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Brand> listBrand( String firstChar,int page); 
	
	
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Category> listCategory( String firstChar,int page); 
	/**
	 * 以树的形式显示列表
	 * @return
	 */
	List<Category> treeCategory(); 
	
	

}
