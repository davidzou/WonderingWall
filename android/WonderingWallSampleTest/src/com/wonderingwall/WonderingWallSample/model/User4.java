package com.wonderingwall.WonderingWallSample.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.DATA_TYPE;

public class User4 implements BaseModel {
	private List<String> strs;

	private ArrayList<Integer> intList;

	private ArrayDeque<String> strList;
	
	private Map<String, String> map;

	@Conversionable(value="strs", type=DATA_TYPE.LIST)
	public List<String> getStrs() {
		return strs;
	}

	public void setStrs(List<String> strs) {
		this.strs = strs;
	}

	@Conversionable(value="intlist", type=DATA_TYPE.LIST)
	public ArrayList<Integer> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<Integer> intList) {
		this.intList = intList;
	}

	@Conversionable(value="strlist", type=DATA_TYPE.LIST)
	public ArrayDeque<String> getStrList() {
		return strList;
	}

	public void setStrList(ArrayDeque<String> strList) {
		this.strList = strList;
	}

	@Conversionable(value="map", type=DATA_TYPE.LIST)
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

}