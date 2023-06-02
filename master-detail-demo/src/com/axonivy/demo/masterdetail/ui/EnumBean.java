package com.axonivy.demo.masterdetail.ui;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.axonivy.demo.masterdetail.enums.Availability;
import com.axonivy.demo.masterdetail.enums.ProductStatus;
import com.axonivy.demo.masterdetail.enums.Quality;

@ManagedBean(name="enumBean")
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
