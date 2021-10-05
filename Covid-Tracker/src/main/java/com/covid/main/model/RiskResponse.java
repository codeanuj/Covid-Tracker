package com.covid.main.model;

public class RiskResponse {

	private int riskPercentage;

	
	public RiskResponse(int riskPercentage) {
		super();
		this.riskPercentage = riskPercentage;
	}

	public int getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(int riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

	@Override
	public String toString() {
		return "RiskResponse [riskPercentage=" + riskPercentage + "]";
	}
	
	
	
}
