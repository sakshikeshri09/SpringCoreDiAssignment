package com.mylab13;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {

	@Value("PES BU")
	private String sbuId;
	@Value("Harrist")
	private String sbuName;
	@Value("Project engineering services")
	private String sbuHead;
	
	
	private List<Employee> list;
	
	public List<Employee> getList() {
		return list;
	}

	@Autowired
	public void setList(List<Employee> list) {
		this.list = list;
	}

	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SBUBean [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
}
