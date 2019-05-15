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
     * Description: 查询所有商品
     *
     * @author Yin
     * @return
     */
	//查询good表下
    List<Map<String, Object>> selectAllGoods();
    
    //查询user表下
    List<Map<String, Object>> selectAllUsers();	  
    
    //
    List<Map<String, Object>> selectpwdUsers(Long id);	
    
    //login
    List<Map<String, Object>> selectLogin(Long id , String pwd);	
    
    
    
    
    //id查询
    int findById(Long id);
    /**
     * 
     * Description: 添加商品
     *
     * @author Yin
     * @return
     */
    //good表添加数据
    boolean saveGood(Good good);
       
    // boolean saveUser(User_user good);
    // int saveUser(User_user good);
    
    // uesr表内添加数据
    int saveUser(User_user user);
    
    //user表内修改数据
    int saveIdUser(User_user user);
    
    /**
     * 
     * Description: 删除
     *
     * @author Yin
     * @return
     */
    // good表按id删除
    boolean removeGood(Long id);
    
    // user表按id删除
    int removeUser(Long id);

//	List<Map<String, Object>> selectAllUsers();
   

  

}
