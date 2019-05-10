/**
 * Project Name:dingpeng_springboot2
 * File Name:GoodMapper.java
 * Package Name:cn.java.mapper
 * Date:上午11:23:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.mapper;
/**
 * Description:	  
 * @author   Yin
 * @version  
 * @see 	 
 */

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.java.entity.Good;
import cn.java.entity.User_user;

//import cn.java.entity.Good;

public interface GoodMapper {

//	//查询
//    @Select("SELECT * FROM springboot.goods")
//    public List<Map<String, Object>> getAllGoods();
//
//    public List<Good> selectAllGoods();

	/**
	 * 
	 * Description:获取springboot库下goods表中所有的数据 <br/>
	 *
	 * @author Yin
	 * @return
	 */
	// 查询
	@Select("SELECT * FROM springboot.goods")
	List<Map<String, Object>> getAllGood();

	@Select("SELECT * FROM user.user")
	List<Map<String, Object>> getAllUser();

	/**
	 * 
	 * Description:添加数据到springboot库下
	 *
	 * @author Yin
	 * @return
	 */
	@Insert("INSERT INTO `springboot`.`goods` (`good_name`, `good_price`, `good_phone`, `good_address`, `good_num`) VALUES (#{goodName}, #{goodPrice}, #{goodPhone}, #{goodAddress}, #{goodNum})")
	int addGood(Good good);

	@Insert("INSERT INTO `user`.`user` (`user_nick`, `user_pwd`, `user_phone`, `user_email`, `user_age`) VALUES (#{nick}, #{pwd}, #{phone}, #{email}, #{age})")
	int addUser_user(User_user user_user);

	/**
	 * 
	 * Description:删除springboot库下的数据
	 *
	 * @author Yin
	 * @return
	 */
	// 删除
	@Delete("DELETE FROM springboot.goods WHERE id=#{arg0}")
	int delGood(Long id);

	@Delete("DELETE FROM user.user WHERE user_id=#{arg0}")
	int delUser(Long id);

}
