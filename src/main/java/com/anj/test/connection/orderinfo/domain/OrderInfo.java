package com.anj.test.connection.orderinfo.domain;

import java.io.Serializable;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("orderInfo")
public class OrderInfo extends Model<OrderInfo> implements Serializable {

	private static final long serialVersionUID = -7379086146954564988L;

	@TableId( value = "id", type = IdType.AUTO )
	private Long id;

	/**
	 * 订单编号
	 */
	private String orderNo;

	/**
	 * 下单人id
	 */
	private Long passengerID;

	/**
	 * 乘客姓名
	 */
	private String passengerName;

	/**
	 * 乘客手机号
	 */
	private String passengerPhone;

	/**
	 * 订单中显示的姓名
	 */
	private String showName;

	/**
	 * 订单中使用的手机号
	 */
	private String showPhone;

	/**
	 * 订单来源 appwxgzh微信公众号wxxcx微信小程序
	 */
	private String channelType;

	/**
	 * 订单状态:0:新单 1:已派单 2:已接单 3开始出发 4:到达预约地 5:执行中6:未支付7已完成 8:已销单
	 */
	private Long status;

	/**
	 * 司机ID
	 */
	private Long driverID;

	/**
	 * 司机姓名
	 */
	private String driverName;

	/**
	 * 司机手机号
	 */
	private String driverPhone;

	/**
	 * 所属运营公司ID
	 */
	private Long companyID;

	/**
	 * 所属运营公司名称
	 */
	private String companyName;

	/**
	 * 开始地址
	 */
	private String startAddress;

	/**
	 * 开始地址纬度
	 */
	private Double startLat;

	/**
	 * 开始地址经度
	 */
	private Double startLng;

	/**
	 * 目的地
	 */
	private String endAddress;

	/**
	 * 目的地址纬度
	 */
	private Double endLat;

	/**
	 * 目的地址经度
	 */
	private Double endLng;

	/**
	 * 司机所在公司id
	 */
	private Long dirverCompanyId;

	/**
	 * 司机所属公司名称
	 */
	private String driverCompanyName;

	/**
	 * 下单时间
	 */
	private Date created;

	/**
	 * 预约时间
	 */
	private Date serverTime;

	/**
	 * ssdd实时订单 yydd预约订单 jjdd接机 sjdd送机 qrzdd全日租 brzdd半日租 jzdd接站 szdd送站
	 */
	private String orderType;

	/**
	 * kc快车 zc专车 czc出租车
	 */
	private String orderServiceType;

	/**
	 * 车辆服务类型：kc快车 zcss专车舒适 zchh专车豪华 zcsw专车商务 czc出租车
	 */
	private String carServiceType;

	/**
	 * 结算规则ID
	 */
	private Long payRuleID;

	/**
	 * 司机对订单是否评价（0 否 1 是）
	 */
	private Integer isDriverReview;

	/**
	 * 乘客是否评价(0否1是)
	 */
	private Integer isPassReview;

	/**
	 * 是否特殊订单（0  正常  1  特殊订单）
	 */
	private Integer isSpecial;

	/**
	 * 销单原因
	 */
	private String cancelCause;

	/**
	 * 政企企业id
	 */
	private Long enterpriseID;

	/**
	 * 上次催促时间
	 */
	private Date lasturge;

	/**
	 * 司机到达目的地的时间
	 */
	private Date treatmentDate;

	/**
	 * 乘客支付完成的时间
	 */
	private Date finishTime;

	/**
	 * 司机收入
	 */
	private Double driverProfit;

	/**
	 * 运营公司收入
	 */
	private Double companyProfit;

	/**
	 * 是否报销0否1是
	 */
	private Integer isReimburse;

	/**
	 * 虚拟手机号
	 */
	private String virtualMobile;

	/**
	 *
	 */
	private Date updated;
	/**
	 * 乘客上车时间
	 */
	private Date passTime;
	/**
	 * 区域编号
	 */
	private String areaCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(Long passengerID) {
		this.passengerID = passengerID;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getShowPhone() {
		return showPhone;
	}

	public void setShowPhone(String showPhone) {
		this.showPhone = showPhone;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getDriverID() {
		return driverID;
	}

	public void setDriverID(Long driverID) {
		this.driverID = driverID;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public Long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStartAddress() {
		return startAddress;
	}

	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	public Double getStartLat() {
		return startLat;
	}

	public void setStartLat(Double startLat) {
		this.startLat = startLat;
	}

	public Double getStartLng() {
		return startLng;
	}

	public void setStartLng(Double startLng) {
		this.startLng = startLng;
	}

	public String getEndAddress() {
		return endAddress;
	}

	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	public Double getEndLat() {
		return endLat;
	}

	public void setEndLat(Double endLat) {
		this.endLat = endLat;
	}

	public Double getEndLng() {
		return endLng;
	}

	public void setEndLng(Double endLng) {
		this.endLng = endLng;
	}

	public Long getDirverCompanyId() {
		return dirverCompanyId;
	}

	public void setDirverCompanyId(Long dirverCompanyId) {
		this.dirverCompanyId = dirverCompanyId;
	}

	public String getDriverCompanyName() {
		return driverCompanyName;
	}

	public void setDriverCompanyName(String driverCompanyName) {
		this.driverCompanyName = driverCompanyName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getServerTime() {
		return serverTime;
	}

	public void setServerTime(Date serverTime) {
		this.serverTime = serverTime;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderServiceType() {
		return orderServiceType;
	}

	public void setOrderServiceType(String orderServiceType) {
		this.orderServiceType = orderServiceType;
	}

	public String getCarServiceType() {
		return carServiceType;
	}

	public void setCarServiceType(String carServiceType) {
		this.carServiceType = carServiceType;
	}

	public Long getPayRuleID() {
		return payRuleID;
	}

	public void setPayRuleID(Long payRuleID) {
		this.payRuleID = payRuleID;
	}

	public Integer getIsDriverReview() {
		return isDriverReview;
	}

	public void setIsDriverReview(Integer isDriverReview) {
		this.isDriverReview = isDriverReview;
	}

	public Integer getIsPassReview() {
		return isPassReview;
	}

	public void setIsPassReview(Integer isPassReview) {
		this.isPassReview = isPassReview;
	}

	public Integer getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Integer isSpecial) {
		this.isSpecial = isSpecial;
	}

	public String getCancelCause() {
		return cancelCause;
	}

	public void setCancelCause(String cancelCause) {
		this.cancelCause = cancelCause;
	}

	public Long getEnterpriseID() {
		return enterpriseID;
	}

	public void setEnterpriseID(Long enterpriseID) {
		this.enterpriseID = enterpriseID;
	}

	public Date getLasturge() {
		return lasturge;
	}

	public void setLasturge(Date lasturge) {
		this.lasturge = lasturge;
	}

	public Date getTreatmentDate() {
		return treatmentDate;
	}

	public void setTreatmentDate(Date treatmentDate) {
		this.treatmentDate = treatmentDate;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Double getDriverProfit() {
		return driverProfit;
	}

	public void setDriverProfit(Double driverProfit) {
		this.driverProfit = driverProfit;
	}

	public Double getCompanyProfit() {
		return companyProfit;
	}

	public void setCompanyProfit(Double companyProfit) {
		this.companyProfit = companyProfit;
	}

	public Integer getIsReimburse() {
		return isReimburse;
	}

	public void setIsReimburse(Integer isReimburse) {
		this.isReimburse = isReimburse;
	}

	public String getVirtualMobile() {
		return virtualMobile;
	}

	public void setVirtualMobile(String virtualMobile) {
		this.virtualMobile = virtualMobile;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getPassTime() {
		return passTime;
	}

	public void setPassTime(Date passTime) {
		this.passTime = passTime;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	@Override
	protected Serializable pkVal () {
		return this.id;
	}
}
