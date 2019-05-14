package cn.java.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	/**
	 * 查询good表方法
	 */
	@RequestMapping("/All")
	public String getGoods(HttpServletRequest request) {

		List<Map<String, Object>> goodlist = goodService.selectAllGoods();
		request.setAttribute("goodlist", goodlist);
		return "admin/listFoods.jsp";
	}

	/**
	 * 查询user表方法
	 */
	@RequestMapping("/AllUser")
	public String getUser(HttpServletRequest request) {

		List<Map<String, Object>> userlist = goodService.selectAllUsers();
		request.setAttribute("userlist", userlist);
		return "admin/listUser.jsp";
	}
	
	/**
	 * 查询user表按id查询密码
	 */
	@RequestMapping("/User")

	public String getpwsUser(Long id,HttpServletRequest request) {
		List<Map<String, Object>> userpswlist = goodService.selectpwdUsers(id);
		request.setAttribute("userpswlist", userpswlist);
		return  "/admin/listUserPwd.jsp";
	}
	
	
	
	@RequestMapping("/login")
	
	public String getLogin(long id, String pwd, HttpServletRequest request) {
		List<Map<String, Object>> LoginList = goodService.selectLogin(id, pwd);
		request.setAttribute("LoginList", LoginList);
		return  "admin/listUserLogin.jsp";
	}


	/**
	 * 往good表内添加信息
	 */
	@RequestMapping("/insertGood")
	@ResponseBody
	public boolean insertGood(Good good) {
		return goodService.saveGood(good);
	}

	/**
	 * 按id删除good表里信息
	 */
	@RequestMapping("/deleteGood")
	@ResponseBody
	public boolean deleteGood(Long id) {

		return goodService.removeGood(id);
	}

	/**
	 * 按id删除user表里信息
	 */
	@RequestMapping("/deleteUser")

	public String deleteUser(Long id, HttpServletRequest request) {
		goodService.removeUser(id);
		List<Map<String, Object>> userlist = goodService.selectAllUsers();
		request.setAttribute("userlist", userlist);
		return "admin/listUser.jsp";
	}

	/**
	 * 往user表内添加信息 //注册
	 */
	@RequestMapping("/register")
	public String register(@Valid User_user user, BindingResult br, HttpServletRequest request) {

		// 校验
		boolean hasErrors = br.hasErrors();
		if (hasErrors) {// 数据格式不满足要求
			Map<String, Object> errorMap = new HashMap<String, Object>();

			List<FieldError> errorList = br.getFieldErrors();
			for (FieldError fieldError : errorList) {
				String field = fieldError.getField();
				String defaultMessage = fieldError.getDefaultMessage();
				System.out.println(field + defaultMessage);
				errorMap.put(field, defaultMessage);
			}

			request.setAttribute("user", user);
			request.setAttribute("errorMap", errorMap);
			return "front/register.jsp";

		} else {// 格式完全正确
			System.out.println("格式正确已插入数据库");

			// 插入数据库
			goodService.saveUser(user);
			return "front/hello.jsp";
		}

	}

	/**
	 * 修改
	 */
	@RequestMapping("/upId")
	public String upId(@Valid User_user user, BindingResult br, HttpServletRequest request) {
		// 查询
		List<Map<String, Object>> userlist = goodService.selectAllUsers();
		request.setAttribute("userlist", userlist);
		// 校验
		boolean hasErrors = br.hasErrors();
		if (hasErrors) {// 数据格式不满足要求
			Map<String, Object> errorMap = new HashMap<String, Object>();

			List<FieldError> errorList = br.getFieldErrors();
			for (FieldError fieldError : errorList) {
				String field = fieldError.getField();
				String defaultMessage = fieldError.getDefaultMessage();
				System.out.println(field + defaultMessage);
				errorMap.put(field, defaultMessage);
			}

			request.setAttribute("user", user);
			request.setAttribute("errorMap", errorMap); 
			return "front/upDate.jsp";

		} else {// 格式完全正确
			System.out.println("格式正确已插入数据库");

			// 插入数据库
//			System.out.println(user + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	
			goodService.saveIdUser(user);
			return "admin/listUser.jsp";
		}
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
