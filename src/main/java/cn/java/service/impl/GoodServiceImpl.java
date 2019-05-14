
package cn.java.service.impl;
/**
 * Description:	   <br/>
 * @author   Yin
 * @version  
 * @see 	 
 */

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.java.entity.Good;
import cn.java.entity.User_user;
import cn.java.mapper.GoodMapper;
import cn.java.service.GoodService;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.GoodService#getAll()
     */
//     @Override
//     public List<Map<String, Object>> getAll() {
//     return goodMapper.getAllGoods();
//     }

//    @Override
//    public List<Good> getAll() {
//        return goodMapper.selectAllGoods();
//    }
    /**
     * 查询
     */
    
    // good表全部查询
	@Override
	public List<Map<String, Object>> selectAllGoods() {
		
		return goodMapper.getAllGood();
	}
	
	// user表全部查询
	@Override
	public List<Map<String, Object>> selectAllUsers() {
		return goodMapper.getAllUser();
	}
	
	// user表按id 查询 未实施
    @Override
    public int findById(Long id) {
    	return goodMapper.findById(id);
    }

    @Override
    public List<Map<String, Object>> selectpwdUsers(Long id) {
		return goodMapper.getpwdUser(id);
	}
    
    @Override
    public List<Map<String, Object>> selectLogin(Long id , String pwd){
    	return goodMapper.getLogin(id, pwd);
    }
    
    

    
    /**
     * 添加
     */
	
	//good表添加
    @Override
    public  boolean saveGood(Good good) {
    	return goodMapper.addGood(good) >= 1 ? true:false;
    }
    
    // user表添加
    @Override
    public  int saveUser(User_user user_user) {
    	return goodMapper.addUser_user(user_user);
    }
    
    // user表修改
    @Override
    public  int saveIdUser(User_user user_user) {
    	return goodMapper.addidUser_user(user_user);
    }
   
    /**
     * 删除
     */
    // good表 按id删除
    @Override
    public boolean removeGood(Long id) {
    	return goodMapper.delGood(id)>=1? true : false;
    }
    
    //user表按id删除
    @Override
    public int removeUser(Long id) {
    	return goodMapper.delUser(id);
    }


}

