package com.ibm;

public class Sample {
	private String sampleName;
	private int samplePrice;

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public int getSamplePrice() {
		return samplePrice;
	}

	public void setSamplePrice(int samplePrice) {
		this.samplePrice = samplePrice;
	}

	@Override
	public String toString() {
		return "Sample [sampleName=" + sampleName + ", samplePrice=" + samplePrice + "]";
	}

}