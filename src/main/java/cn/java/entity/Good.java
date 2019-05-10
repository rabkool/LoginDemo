package cn.java.entity;

public class Good {
	/**
	 * 主键id
	 */
    private Long id;
    
    /**
	 * 名字
	 */
    private String goodName;
    
    /**
	 * 价格
	 */
    private Float goodPrice;
    
    /**
	 * 电话
	 */
    private String goodPhone;

    /**
	 * 地址
	 */
    private String goodAddress;

    /**
	 * 数量
	 */
    private Integer goodNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Float getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Float goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodPhone() {
        return goodPhone;
    }

    public void setGoodPhone(String goodPhone) {
        this.goodPhone = goodPhone;
    }

    public String getGoodAddress() {
        return goodAddress;
    }

    public void setGoodAddress(String goodAddress) {
        this.goodAddress = goodAddress;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }
}