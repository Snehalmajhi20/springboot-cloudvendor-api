package com.codewithsnehal.firstprogram.model;

public class CloudVendor {
	private String vendorId;
	private String vendoName;
	private String vendorAddress;
	private String vendorPhone;
	public CloudVendor(String vendorId, String vendoName, String vendorAddress, String vendorPhone) {
//		super();
		this.vendorId = vendorId;
		this.vendoName = vendoName;
		this.vendorAddress = vendorAddress;
		this.vendorPhone = vendorPhone;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendoName() {
		return vendoName;
	}
	public void setVendoName(String vendoName) {
		this.vendoName = vendoName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

}
