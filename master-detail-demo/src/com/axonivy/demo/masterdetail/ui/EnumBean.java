package com.axonivy.demo.masterdetail.ui;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import com.axonivy.demo.masterdetail.enums.Availability;
import com.axonivy.demo.masterdetail.enums.ProductStatus;
import com.axonivy.demo.masterdetail.enums.Quality;

@Named(value="enumBean")
@ApplicationScoped
public class EnumBean {
	public ProductStatus[] getProductStatusValues() {
		return ProductStatus.values();
	}
	
	public Quality[] getQualityValues() {
		return Quality.values();
	}

	public Availability[] getAvailabilitylValues() {
		return Availability.values();
	}
}
