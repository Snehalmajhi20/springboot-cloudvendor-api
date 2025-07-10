package com.codewithsnehal.firstprogram.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithsnehal.firstprogram.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	
	public CloudVendor getCouldVendorDetails(String vendorId) {
		return cloudVendor;
//				new CouldVendor("101", "Snehal", "Mumbai", "1234567891");
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud vendor created Successfully!";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud vendor updated Successfully!";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Cloud vendor deleted Successfully!";
	}

}
