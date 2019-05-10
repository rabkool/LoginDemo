package cn.java.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.java.entity.Good;
import cn.java.entity.User_user;

import cn.java.service.GoodService;

/**
 * 
 * @author Yin
 * @version
 * @see
 */
@Controller

public class GoodController {
	@Autowired
	private GoodService goodService;

//     获取goods表中所有的数据
//    @RequestMapping("/selectAllGoods.do")
//    @ResponseBody
//    public List<Good> selectAllGoods() {
////    public List<Map<String,Object>> selectAllGoods() {
//    	System.out.println("@@@@@@@@@@@@@@@@");  
//        return goodService.getAll();
//    }

	@RequestMapping("/All")
	public String getGoods(HttpServletRequest request) {

		List<Map<String, Object>> goodlist = goodService.selectAllGoods();
		request.setAttribute("goodlist", goodlist);
		return "admin/listFoods.jsp";
	}

	@RequestMapping("/insertGood")
	@ResponseBody
	public boolean insertGood(Good good) {
		return goodService.saveGood(good);
	}

	@RequestMapping("/deleteGood")
	@ResponseBody
	public boolean deleteGood(Long id) {
		return goodService.removeGood(id);
	}

	@RequestMapping("/registerQQ")
	public String registerQQ(@Valid User_user user, BindingResult br) {

		 boolean hasErrors = br.hasErrors();
	        if (hasErrors) {// 数据格式不满足要求
	      
	            List<FieldError> errorList = br.getFieldErrors();
	            for (FieldError fieldError : errorList) {
	                String field = fieldError.getField();
	                String defaultMessage = fieldError.getDefaultMessage();
	                System.out.println(field + defaultMessage);
	            }
	   
	        } else {// 格式完全正确
	            System.out.println("亲，格式正确，可以调用业务层方法了");
	        	goodService.saveUser(user);
	        }
  
		return "front/registerQQ.jsp";
	}

//	@RequestMapping("/register")
//	public String register(@RequestParam("nick") String nick,
//			@RequestParam("pwd") String pwd,
//			@RequestParam("phone") String phone, 
//			@RequestParam("email") String email,
//			@RequestParam("age") Integer age,
//			BindingResult br) {
//
//		User_user user_user = new User_user();
//		user_user.setNick(nick);
//		user_user.setPwd(pwd);
//		user_user.setPhone(phone);
//		user_user.setEmail(email);
//		user_user.setAge(age);
//
//		System.out.println(user_user);
//		goodService.saveUser(user_user);
//		return "front/registerQQ.jsp";
//
//	}

}
