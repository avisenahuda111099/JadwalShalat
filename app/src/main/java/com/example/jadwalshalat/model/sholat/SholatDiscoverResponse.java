package com.example.jadwalshalat.model.sholat;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SholatDiscoverResponse{

	@SerializedName("code")
	private int code;

	@SerializedName("data")
	private ArrayList<Timings> data;

	@SerializedName("status")
	private String status;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setData(ArrayList<Timings> data){
		this.data = data;
	}

	public ArrayList<Timings> getData(){
		return data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"SholatDiscoverResponse{" + 
			"code = '" + code + '\'' + 
			",data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}