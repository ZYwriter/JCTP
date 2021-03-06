package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u4ea4\u6613\u6240\u62a5\u5355<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1403</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcExchangeOrderField extends StructObject {
	/**
	 * \u62a5\u5355\u4ef7\u683c\u6761\u4ef6<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(0) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 0);
	}
	/**
	 * \u62a5\u5355\u4ef7\u683c\u6761\u4ef6<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(0) 
	public CThostFtdcExchangeOrderField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 0, OrderPriceType);
		return this;
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(1) 
	public byte Direction() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(1) 
	public CThostFtdcExchangeOrderField Direction(byte Direction) {
		this.io.setByteField(this, 1, Direction);
		return this;
	}
	/**
	 * \u7ec4\u5408\u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcCombOffsetFlagType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > CombOffsetFlag() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u7ec4\u5408\u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcCombHedgeFlagType
	 */
	@Array({5}) 
	@Field(3) 
	public Pointer<Byte > CombHedgeFlag() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u4ef7\u683c<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public CThostFtdcExchangeOrderField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 4, LimitPrice);
		return this;
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public CThostFtdcExchangeOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 5, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \u6709\u6548\u671f\u7c7b\u578b<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(6) 
	public byte TimeCondition() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \u6709\u6548\u671f\u7c7b\u578b<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(6) 
	public CThostFtdcExchangeOrderField TimeCondition(byte TimeCondition) {
		this.io.setByteField(this, 6, TimeCondition);
		return this;
	}
	/**
	 * GTD\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > GTDDate() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u6210\u4ea4\u91cf\u7c7b\u578b<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(8) 
	public byte VolumeCondition() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u6210\u4ea4\u91cf\u7c7b\u578b<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(8) 
	public CThostFtdcExchangeOrderField VolumeCondition(byte VolumeCondition) {
		this.io.setByteField(this, 8, VolumeCondition);
		return this;
	}
	/**
	 * \u6700\u5c0f\u6210\u4ea4\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public int MinVolume() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \u6700\u5c0f\u6210\u4ea4\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public CThostFtdcExchangeOrderField MinVolume(int MinVolume) {
		this.io.setIntField(this, 9, MinVolume);
		return this;
	}
	/**
	 * \u89e6\u53d1\u6761\u4ef6<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(10) 
	public byte ContingentCondition() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \u89e6\u53d1\u6761\u4ef6<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(10) 
	public CThostFtdcExchangeOrderField ContingentCondition(byte ContingentCondition) {
		this.io.setByteField(this, 10, ContingentCondition);
		return this;
	}
	/**
	 * \u6b62\u635f\u4ef7<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(11) 
	public double StopPrice() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \u6b62\u635f\u4ef7<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(11) 
	public CThostFtdcExchangeOrderField StopPrice(double StopPrice) {
		this.io.setDoubleField(this, 11, StopPrice);
		return this;
	}
	/**
	 * \u5f3a\u5e73\u539f\u56e0<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(12) 
	public byte ForceCloseReason() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \u5f3a\u5e73\u539f\u56e0<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(12) 
	public CThostFtdcExchangeOrderField ForceCloseReason(byte ForceCloseReason) {
		this.io.setByteField(this, 12, ForceCloseReason);
		return this;
	}
	/**
	 * \u81ea\u52a8\u6302\u8d77\u6807\u5fd7<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(13) 
	public int IsAutoSuspend() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * \u81ea\u52a8\u6302\u8d77\u6807\u5fd7<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(13) 
	public CThostFtdcExchangeOrderField IsAutoSuspend(int IsAutoSuspend) {
		this.io.setIntField(this, 13, IsAutoSuspend);
		return this;
	}
	/**
	 * \u4e1a\u52a1\u5355\u5143<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(14) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(15) 
	public int RequestID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(15) 
	public CThostFtdcExchangeOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 15, RequestID);
		return this;
	}
	/**
	 * \u672c\u5730\u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(16) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(17) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(18) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u5ba2\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(19) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \u5408\u7ea6\u5728\u4ea4\u6613\u6240\u7684\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(20) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(22) 
	public int InstallID() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(22) 
	public CThostFtdcExchangeOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 22, InstallID);
		return this;
	}
	/**
	 * \u62a5\u5355\u63d0\u4ea4\u72b6\u6001<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(23) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 23);
	}
	/**
	 * \u62a5\u5355\u63d0\u4ea4\u72b6\u6001<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(23) 
	public CThostFtdcExchangeOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 23, OrderSubmitStatus);
		return this;
	}
	/**
	 * \u62a5\u5355\u63d0\u793a\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(24) 
	public int NotifySequence() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * \u62a5\u5355\u63d0\u793a\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(24) 
	public CThostFtdcExchangeOrderField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 24, NotifySequence);
		return this;
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(25) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(26) 
	public int SettlementID() {
		return this.io.getIntField(this, 26);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(26) 
	public CThostFtdcExchangeOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 26, SettlementID);
		return this;
	}
	/**
	 * \u62a5\u5355\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(27) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \u62a5\u5355\u6765\u6e90<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(28) 
	public byte OrderSource() {
		return this.io.getByteField(this, 28);
	}
	/**
	 * \u62a5\u5355\u6765\u6e90<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(28) 
	public CThostFtdcExchangeOrderField OrderSource(byte OrderSource) {
		this.io.setByteField(this, 28, OrderSource);
		return this;
	}
	/**
	 * \u62a5\u5355\u72b6\u6001<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(29) 
	public byte OrderStatus() {
		return this.io.getByteField(this, 29);
	}
	/**
	 * \u62a5\u5355\u72b6\u6001<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(29) 
	public CThostFtdcExchangeOrderField OrderStatus(byte OrderStatus) {
		this.io.setByteField(this, 29, OrderStatus);
		return this;
	}
	/**
	 * \u62a5\u5355\u7c7b\u578b<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	@Field(30) 
	public byte OrderType() {
		return this.io.getByteField(this, 30);
	}
	/**
	 * \u62a5\u5355\u7c7b\u578b<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	@Field(30) 
	public CThostFtdcExchangeOrderField OrderType(byte OrderType) {
		this.io.setByteField(this, 30, OrderType);
		return this;
	}
	/**
	 * \u4eca\u6210\u4ea4\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(31) 
	public int VolumeTraded() {
		return this.io.getIntField(this, 31);
	}
	/**
	 * \u4eca\u6210\u4ea4\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(31) 
	public CThostFtdcExchangeOrderField VolumeTraded(int VolumeTraded) {
		this.io.setIntField(this, 31, VolumeTraded);
		return this;
	}
	/**
	 * \u5269\u4f59\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32) 
	public int VolumeTotal() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * \u5269\u4f59\u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32) 
	public CThostFtdcExchangeOrderField VolumeTotal(int VolumeTotal) {
		this.io.setIntField(this, 32, VolumeTotal);
		return this;
	}
	/**
	 * \u62a5\u5355\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(33) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \u59d4\u6258\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(34) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * \u6fc0\u6d3b\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(35) 
	public Pointer<Byte > ActiveTime() {
		return this.io.getPointerField(this, 35);
	}
	/**
	 * \u6302\u8d77\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(36) 
	public Pointer<Byte > SuspendTime() {
		return this.io.getPointerField(this, 36);
	}
	/**
	 * \u6700\u540e\u4fee\u6539\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(37) 
	public Pointer<Byte > UpdateTime() {
		return this.io.getPointerField(this, 37);
	}
	/**
	 * \u64a4\u9500\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(38) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * \u6700\u540e\u4fee\u6539\u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(39) 
	public Pointer<Byte > ActiveTraderID() {
		return this.io.getPointerField(this, 39);
	}
	/**
	 * \u7ed3\u7b97\u4f1a\u5458\u7f16\u53f7<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(40) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 40);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(41) 
	public int SequenceNo() {
		return this.io.getIntField(this, 41);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(41) 
	public CThostFtdcExchangeOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 41, SequenceNo);
		return this;
	}
	/**
	 * \u8425\u4e1a\u90e8\u7f16\u53f7<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(42) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 42);
	}
	/**
	 * IP\u5730\u5740<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(43) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 43);
	}
	/**
	 * Mac\u5730\u5740<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(44) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 44);
	}
	public CThostFtdcExchangeOrderField() {
		super();
	}
	public CThostFtdcExchangeOrderField(Pointer pointer) {
		super(pointer);
	}
}
