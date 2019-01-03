package com.anj.test.connection.driveraccount.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author anj
 */
@Data
@EqualsAndHashCode( callSuper = true )
@Accessors( chain = true )
@TableName( "driverAccount" )
public class DriverAccount extends Model<DriverAccount> implements Serializable {

	private static final long serialVersionUID = 3248660042012924659L;

	/**
	 * 主键
	 */
	@TableId( value = "id", type = IdType.AUTO )
	private Long id;
	/**
	 * 司机信息ID
	 */
	private Long driverInfoID;
	/**
	 * kc快车
	 * zc专车
	 */
	private String driverServiceType;
	/**
	 * 司机评分
	 */
	private Double score;
	/**
	 * 车牌号码
	 */
	private String carNumber;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 是否限行，0否1是
	 */
	private Integer limitLine;
	/**
	 * 登录标识
	 */
	private String token;
	/**
	 * 所属运营企业ID
	 */
	private Long companyID;
	/**
	 * 周期内成交量（订单量统计）
	 */
	private Long transactionVolume;
	/**
	 * 周期内投诉率%
	 */
	private String complaint;
	/**
	 * 0 空闲, 1派单,2忙碌 , 3离线
	 */
	private Integer driverStatus;
	/**
	 * 余额
	 */
	private BigDecimal balance;
	/**
	 * 头像
	 */
	private String photo;
	/**
	 * 设备类型（IOS，ANDROID）
	 */
	private String deviceType;
	/**
	 * APP版本
	 */
	private String appVersion;
	/**
	 * 推送设备id，用于APP端接收推送数据，唯一标识
	 */
	private String cID;
	/**
	 * 创建时间
	 */
	private Date created;

	/**
	 * 所属运营企业
	 */
	private String companyName;

	/**
	 * 上传位置时间
	 */
	private Date upLocationTime;
	/**
	 * 上传位置经度
	 */
	private Double upLng;
	/**
	 * 上传位置纬度
	 */
	private Double upLat;
	/**
	 * 当前执行的订单号
	 */
	private String currentOrderNo;

	/**
	 * token失效时间
	 */
	private Date tokenDeathTime;

	/**
	 * 安全密码
	 */
	private String securityPassword;

	public Long getDriverInfoID() {
		return driverInfoID;
	}

	public void setDriverInfoID(Long driverInfoID) {
		this.driverInfoID = driverInfoID;
	}

	public String getDriverServiceType() {
		return driverServiceType;
	}

	public void setDriverServiceType(String driverServiceType) {
		this.driverServiceType = driverServiceType;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getLimitLine() {
		return limitLine;
	}

	public void setLimitLine(Integer limitLine) {
		this.limitLine = limitLine;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}

	public Long getTransactionVolume() {
		return transactionVolume;
	}

	public void setTransactionVolume(Long transactionVolume) {
		this.transactionVolume = transactionVolume;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public Integer getDriverStatus() {
		return driverStatus;
	}

	public void setDriverStatus(Integer driverStatus) {
		this.driverStatus = driverStatus;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getcID() {
		return cID;
	}

	public void setcID(String cID) {
		this.cID = cID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getUpLocationTime() {
		return upLocationTime;
	}

	public void setUpLocationTime(Date upLocationTime) {
		this.upLocationTime = upLocationTime;
	}

	public Double getUpLng() {
		return upLng;
	}

	public void setUpLng(Double upLng) {
		this.upLng = upLng;
	}

	public Double getUpLat() {
		return upLat;
	}

	public void setUpLat(Double upLat) {
		this.upLat = upLat;
	}

	public String getCurrentOrderNo() {
		return currentOrderNo;
	}

	public void setCurrentOrderNo(String currentOrderNo) {
		this.currentOrderNo = currentOrderNo;
	}

	public Date getTokenDeathTime() {
		return tokenDeathTime;
	}

	public void setTokenDeathTime(Date tokenDeathTime) {
		this.tokenDeathTime = tokenDeathTime;
	}

	public String getSecurityPassword() {
		return securityPassword;
	}

	public void setSecurityPassword(String securityPassword) {
		this.securityPassword = securityPassword;
	}

	@Override
	protected Serializable pkVal () {
		return this.id;
	}
}
