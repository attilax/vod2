package com.focusx.programme.dao;

import java.util.List;
import java.util.Map;
 


import com.focusx.pager.Pager;
import com.focusx.programme.entity.GvProgramme;

/**
 * 
 * @author luojun
 * 
 * Program Name:starx BS坐席
 *
 * Description: 节目单dao层
 * 
 * CreateTime: 2014-7-16  下午2:58:53
 *  
 *
 */
public interface IProgrammeDao {
	/**
	 * 
	 * @author：luojun
	 * 
	 * @Description:获取节目单列表(管理操作)
	 * 
	 * @CreateTime: 2014-7-14 下午01:44:03
	 * 
	 * @param page
	 * @param data
	 * @return
	 */
	public List<GvProgramme> getProgrammeList(Pager<GvProgramme> pager,
			Map conditionMap);

 

	/**
	 * 
	 * @author：luojun
	 * 
	 * @Description:获取节目单列表(管理操作)
	 * 
	 * @CreateTime: 2014-7-14 下午01:44:03
	 * 
	 * @param id
	 *            主键ID
	 * @return
	 */
	public GvProgramme getProgramme(Integer id);

	/**
	 * 
	 * @author：luojun
	 * 
	 * @Description:插入节目单
	 * 
	 * @CreateTime: 2014-7-14 下午01:51:18
	 * 
	 * @param programme
	 * @return
	 */
	public boolean insert(GvProgramme programme);

	/**
	 * 
	 * @author：luojun
	 * 
	 * @Description:更新节目单
	 * 
	 * @CreateTime: 2014-7-14 下午01:53:04
	 * 
	 * @param programme
	 * @return
	 */
	public boolean update(GvProgramme programme);

	/**
	 * 
	 * @author：luojun
	 * 
	 * @Description: 删除节目单
	 * 
	 * @CreateTime: 2014-7-14 下午01:54:43
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	
	/**
	 * 
	  * @author：luojun
	  *
	  * @Description:批量删除数据
	  *  
	  * @CreateTime: 2014-7-15 下午03:13:13
	  *
	  * @param ids
	  * @return
	 */
	public boolean  deleteBatch(List<Integer> ids);
	
	/**
	 * @author leo
	 * 获取节目单门店接收情况
	 * @param pager
	 * @param conditionMap
	 * @return list
	 */
	public List<GvProgramme> getProgrammeReceiveList(Pager<GvProgramme> pager,Map<String, Object> conditionMap);
	
	/**
	 * @author leo
	 * 获取节目单门店接收情况,查询条件下的所有数据,数据导出
	 * @param pager
	 * @param conditionMap
	 * @return list
	 */
	public List<GvProgramme> getAllProgrammeReceiveList(Map<String, Object> conditionMap);
	
}
