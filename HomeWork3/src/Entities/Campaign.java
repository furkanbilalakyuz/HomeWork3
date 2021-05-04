package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity {
	private int indirimOran�;
	private double birimFiyat�;
	public Campaign(int indirimOran�, double birimFiyat�) {
		super();
		this.indirimOran� = indirimOran�;
		this.birimFiyat� = birimFiyat�;
	}
	public int getIndirimOran�() {
		return indirimOran�;
	}
	public void setIndirimOran�(int indirimOran�) {
		this.indirimOran� = indirimOran�;
	}
	public double getBirimFiyat�() {
		return birimFiyat�;
	}
	public void setBirimFiyat�(double birimFiyat�) {
		this.birimFiyat� = birimFiyat�;
	}
	

}
