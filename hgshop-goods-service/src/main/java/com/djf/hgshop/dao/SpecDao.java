package com.djf.hgshop.dao;

import java.util.List;

import com.djf.hgshop.pojo.Spec;
import com.djf.hgshop.pojo.SpecOption;
/**
 * 
 * @ClassName: SpecDao 
 * @Description: TODO
 * @author: 董江帆
 * @date: 2020年3月5日 下午2:44:40
 */
public interface SpecDao {

	List<Spec> list( String name);

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int updateSpec(Spec spec);

	int deleteSpecOtions(int id);

	int deleteSpec(int id);

	Spec get(int id);

	int deleteSpecOtionsBatch(int[] ids);

	int deleteSpecBatch(int[] ids);

}
