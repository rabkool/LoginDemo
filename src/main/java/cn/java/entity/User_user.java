package cn.java.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User_user {

	@Pattern(regexp = "[\\u4E00-\\u9FA5||\\u30a1-\\u30f6||\\u3041-\\u3093]{2,6}", message = "名字输入格式错误")
	private String nick;

	@Pattern(regexp = "[0-9a-zA-Z]{8,16}", message = "密码输入格式错误请输入8-16位")
	private String pwd;

	@Pattern(regexp = "[0-9]{11,11}", message = "手机输入格式错误")
	private String phone;

	@Email(message = "邮箱输入格式错误")
	private String email;

	@Max(value = 150, message = "请正确输入年龄")
	@Min(value = 1, message = "请正确输入年龄")
	private Integer age;

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
		return "User [nick=" + nick + ", pwd=" + pwd + ", phone=" + phone + ", email=" + email + ", age=" + age + "]";
	}

}
