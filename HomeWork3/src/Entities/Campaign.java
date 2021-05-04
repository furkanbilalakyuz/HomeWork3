package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity {
	private int indirimOraný;
	private double birimFiyatý;
	public Campaign(int indirimOraný, double birimFiyatý) {
		super();
		this.indirimOraný = indirimOraný;
		this.birimFiyatý = birimFiyatý;
	}
	public int getIndirimOraný() {
		return indirimOraný;
	}
	public void setIndirimOraný(int indirimOraný) {
		this.indirimOraný = indirimOraný;
	}
	public double getBirimFiyatý() {
		return birimFiyatý;
	}
	public void setBirimFiyatý(double birimFiyatý) {
		this.birimFiyatý = birimFiyatý;
	}
	

}
