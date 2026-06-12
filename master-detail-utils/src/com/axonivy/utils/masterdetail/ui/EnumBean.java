package com.axonivy.utils.masterdetail.ui;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.axonivy.utils.masterdetail.enums.Availability;
import com.axonivy.utils.masterdetail.enums.ProductStatus;
import com.axonivy.utils.masterdetail.enums.Quality;

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
