/**
 * Project Name:dingpeng_springboot2
 * File Name:GoodService.java
 * Package Name:cn.java.service.impl
 * Date:上午11:26:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;

import cn.java.entity.Good;
import cn.java.entity.User_user;

/**
 * Description: <br/>
 * 
 * @author Yin
 * @version
 * @see
 */
public interface GoodService {

  
////     List<Map<String, Object>> getAll();
//
//    List<Good> getAll();
	/**
     * 
     * Description: 查询所有商品<br/>
     *
     * @author Yin
     * @return
     */
    List<Map<String, Object>> selectAllGoods();
    
    /**
     * 
     * Description: 添加商品
     *
     * @author Yin
     * @return
     */
    boolean saveGood(Good good);
//    
//    boolean saveUser(User_user good);
    int saveUser(User_user good);
    
    
    /**
     * 
     * Description: 删除
     *
     * @author Yin
     * @return
     */
    boolean removeGood(Long id);
   

}
