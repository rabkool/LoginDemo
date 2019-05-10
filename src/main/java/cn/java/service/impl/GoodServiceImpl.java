
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
    
    @Override
    public  boolean saveGood(Good good) {
    	return goodMapper.addGood(good) >= 1 ? true:false;
    }
    
    
    @Override
    public  int saveUser(User_user user_user) {
    	return goodMapper.addUser_user(user_user);
    }
    
    
  
    @Override
    public boolean removeGood(Long id) {
    	return goodMapper.delGood(id)>=1? true : false;
    }

	@Override
	public List<Map<String, Object>> selectAllGoods() {
		
		return goodMapper.getAllGood();
	}
	
	


	@Override
	public List<Map<String, Object>> selectAllUsers() {
		return goodMapper.getAllUser();
	}
}

