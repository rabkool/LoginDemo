package cn.java.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User_user {
	/**
	 * id编号
	 */

	@Max(value = 9999999, message = "请正确输入年龄")
	@Min(value = 1, message = "请正确输入年龄")
	
	private Long id;

	/**
	 * 用户名字
	 */
	@NotNull(message = "输入格式错误名字不能为空")
	@Pattern(regexp = "[\\u4E00-\\u9FA5||\\u30a1-\\u30f6||\\u3041-\\u3093]{2,6}", message = "输入格式错误请正确输入名字")
	private String nick;

	/**
	 * 用户密码
	 */
	@NotNull(message = "输入格式错误密码不能为空")
	@Pattern(regexp = "[0-9a-zA-Z]{8,16}", message = "密码输入格式错误请输入8-16位")
	private String pwd;

	/**
	 * 用户手机
	 */
	@NotNull(message = "输入格式错误名字不能为空")
	@Pattern(regexp = "[0-9]{11,11}", message = "手机输入格式错误")
	private String phone;

	/**
	 * 用户邮箱
	 */
	@NotNull(message = "输入格式错误邮箱不能为空")
	@Email(message = "邮箱输入格式错误")
	private String email;

	/**
	 * 用户年龄
	 */
	@NotNull(message = "输入格式错误年龄不能为空")
	@Max(value = 150, message = "请正确输入年龄")
	@Min(value = 1, message = "请正确输入年龄")
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		System.out.println("123123123");
		return "User_user [id=" + id + ", nick=" + nick + ", pwd=" + pwd + ", phone=" + phone + ", email=" + email
				+ ", age=" + age + "]";
	}


	

}
