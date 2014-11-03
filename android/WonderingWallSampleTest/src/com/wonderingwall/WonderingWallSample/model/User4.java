package com.wonderingwall.WonderingWallSample.model;

import java.util.ArrayList;
import java.util.List;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.ConversionableDataType;

public class User4 implements BaseModel {
	private List<User1> strs;

	private ArrayList<Integer> intList;

//	private ArrayDeque<String> strList;
	
//	private Map<String, String> map;

	@Conversionable(value="strs", type=ConversionableDataType.LIST)
	public List<User1> getStrs() {
		return strs;
	}

	public void setStrs(List<User1> strs) {
		this.strs = strs;
	}

	@Conversionable(value="intlist", type=ConversionableDataType.LIST)
	public ArrayList<Integer> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<Integer> intList) {
		this.intList = intList;
	}

//	@Conversionable(value="strlist", type=DATA_TYPE.LIST)
//	public ArrayDeque<String> getStrList() {
//		return strList;
//	}
//
//	public void setStrList(ArrayDeque<String> strList) {
//		this.strList = strList;
//	}
//
//	@Conversionable(value="map", type=DATA_TYPE.MAP)
//	public Map<String, String> getMap() {
//		return map;
//	}
//
//	public void setMap(Map<String, String> map) {
//		this.map = map;
//	}
	
	public String toString(){
		return (strs != null ? "" + strs.size() + "-": "null") + "-" + (intList != null ? "" + intList.size() : "null");
	}

}
