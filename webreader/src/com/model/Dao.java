package com.model;

public class Dao 
{
	private String id;
	private String pname;
	private String pprice;
	private String inum;
	private String pcate;
	private String pdes;
	public Dao(String id,String pname, String pprice, String inum, String pcate, String pdes)
	{
		this.id=id;
		this.pname = pname;
		this.pprice = pprice;
		this.inum = inum;
		this.pcate = pcate;
		this.pdes = pdes;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getInum() {
		return inum;
	}
	public void setInum(String inum) {
		this.inum = inum;
	}
	public String getPcate() {
		return pcate;
	}
	public void setPcate(String pcate) {
		this.pcate = pcate;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	
	
	
	
	
}
