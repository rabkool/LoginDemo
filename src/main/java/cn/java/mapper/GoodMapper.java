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
import org.apache.ibatis.annotations.Update;

import cn.java.entity.Good;
import cn.java.entity.User_user;


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
	
	// 查询user表
	@Select("SELECT * FROM user.user")
	List<Map<String, Object>> getAllUser();
	
	// 按id查询
	@Select("SELECT * FROM user.user WHERE user_id=#{id}")
	int findById(Long id);
	
	//查询密码
	@Select("SELECT user_pwd FROM user.user WHERE user_id=#{id}")

	List<Map<String, Object>> getpwdUser(Long id);
	
	//登入
	@Select("SELECT * FROM user.user WHERE (user_id=#{id}) and (user_pwd=#{pwd})")
	List<Map<String, Object>> getLogin(Long id , String pwd);
	

	/**
	 * 
	 * Description:添加数据到springboot库下
	 *
	 * @author Yin
	 * @return
	 */
	//good表内添加
	@Insert("INSERT INTO `springboot`.`goods` (`good_name`, `good_price`, `good_phone`, `good_address`, `good_num`) VALUES (#{goodName}, #{goodPrice}, #{goodPhone}, #{goodAddress}, #{goodNum})")
	int addGood(Good good);

	//user表内添加
	@Insert("INSERT INTO `user`.`user` (`user_nick`, `user_pwd`, `user_phone`, `user_email`, `user_age`) VALUES (#{nick}, #{pwd}, #{phone}, #{email}, #{age})")
	int addUser_user(User_user user_user);
	
	//user表内修改
	@Update("UPDATE `user`.`user` SET `user_nick` = #{nick}, `user_pwd` =  #{pwd}, `user_phone` =  #{phone}, `user_email` = #{email}, `user_age` = #{age} WHERE (`user_id` = #{id})")  
	int addidUser_user(User_user user_user);
	/**
	 * 
	 * Description:删除springboot库下的数据
	 *
	 * @author Yin
	 * @return
	 */
	// good表删除
	@Delete("DELETE FROM springboot.goods WHERE id=#{arg0}")
	int delGood(Long id);
	
	//user表删除
	@Delete("DELETE FROM user.user WHERE user_id=#{arg0}")
	int delUser(Long id);


}
