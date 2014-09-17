/** 
 * Project Name:zzlibcore 
 * File Name:Column.java 
 * Package Name:com.zzwzm.libcore.database.sql 
 * Date:2014年5月24日上午12:14:40 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 */

package com.wonderingwall.database.sql;

import android.provider.BaseColumns;

/**
 * ClassName:Column <br/>
 * Function: 数据库表字段. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年5月24日 上午12:14:40 <br/>
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version 1.0.0
 * @see
 */
/** 
 * ClassName: Column <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2014年6月4日 下午5:46:06 <br/> 
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version  
 */  
public class Column implements BaseColumns{
	/** 数据类型(用于同个表中存放多种数据结构相同的数据) */
	public static final String _TYPE = "_type";
	/** 最后写入数据库的时间(long字串) */
	public static final String _MODIFIED = "_lastModified";
	
	/**
	 * ClassName: CONSTRAINTS <br/>
	 * Function: 约束用于限制加入表的数据的类型。 <br/>
	 * Reason: 可以在创建表时规定约束（通过 CREATE TABLE 语句），或者在表创建之后也可以（通过 ALTER TABLE 语句）。 <br/>
	 * date: 2014年5月24日 上午12:03:55 <br/>
	 * 
	 * SQLite supports UNIQUE, NOT NULL, CHECK and FOREIGN KEY constraints. 
	 * @author DavidZou
	 * @version 1.0.0
	 * @see <a href='http://www.w3school.com.cn/sql/sql_constraints.asp'>W3CSchool</a>
	 */
	public enum Constraints {
		/**
		 * NOT NULL 约束强制列不接受 NULL 值。<br>
		 * NOT NULL 约束强制字段始终包含值。这意味着，如果不向字段添加值，就无法插入新记录或者更新记录。<br>
		 */
		NOT_NULL("NOT NULL"),

		/**
		 * UNIQUE 约束唯一标识数据库表中的每条记录。<br>
		 * UNIQUE 和 PRIMARY KEY 约束均为列或列集合提供了唯一性的保证。<br>
		 * PRIMARY KEY 拥有自动定义的 UNIQUE 约束。<br>
		 * 请注意，每个表可以有多个 UNIQUE 约束，但是每个表只能有一个 PRIMARY KEY 约束。<br>
		 */
		UNIQUE("UNIQUE"),

		/**
		 * PRIMARY KEY 约束唯一标识数据库表中的每条记录。<br>
		 * 主键必须包含唯一的值。主键列不能包含 NULL 值。每个表都应该有一个主键，并且每个表只能有一个主键。<br>
		 */
		PRIMARY_KEY("PRIMARY KEY"),

		/**
		 * 一个表中的 FOREIGN KEY 指向另一个表中的 PRIMARY KEY。<br>
		 */
		FOREIGN_KEY("FOREIGN KEY"),

		/**
		 * CHECK 约束用于限制列中的值的范围。<br>
		 * 如果对单个列定义 CHECK 约束，那么该列只允许特定的值。<br>
		 * 如果对一个表定义 CHECK 约束，那么此约束会在特定的列中对值进行限制。<br>
		 */
		CHECK("CHECK"), 
		
		/**
		 * DEFAULT 约束用于向列中插入默认值。<br>
		 * 如果没有规定其他的值，那么会将默认值添加到所有的新记录。<br>	
		 */
		DEFAULT("DEFAULT"),
		
		/**
		 * 自增长
		 */
		AUTOINCREMENT("AUTOINCREMENT");

		private String value;

		Constraints(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}
	
	
	/** 
	 * ClassName: DATA_TYPE <br/> 
	 * Function: 数据库表字段的数据类型。<br/> 
	 * Reason: 在创建表是定义字段数据类型。 <br/> 
	 * date: 2014年6月4日 下午5:20:01 <br/> 
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version 1.0.0
	 * @see <a href="http://www.w3school.com.cn/sql/sql_create_table.asp">W3CSchool</a>
	 * @see <a href="http://www.sqlite.org/datatype3.html">SQLite</a>
	 */  
	public enum DataType{
		/**
		 * The value is a NULL value.<br>
		 * NULL 值的处理方式与其他值不同。NULL 用作未知的或不适用的值的占位符。<br>
		 * 如果表中的某个列是可选的，那么我们可以在不向该列添加值的情况下插入新记录或更新已有的记录。这意味着该字段将以 NULL 值保存。<br>
		 * 注释：无法比较 NULL 和 0；它们是不等价的。<br>
		 */
		NULL("NULL"),
		
		/**
		 * The value is a signed integer, stored in 1, 2, 3, 4, 6, or 8 bytes depending on the magnitude of the value.
		 * 仅容纳整数。
		 */
		INTEGER("INTEGER"),
		
		/**
		 * The value is a floating point value, stored as an 8-byte IEEE floating point number.
		 */
		REAL("REAL"),
		
		/**
		 * The value is a text string, stored using the database encoding (UTF-8, UTF-16BE or UTF-16LE).
		 */
		TEXT("TEXT"),
		
		/**
		 * The value is a blob of data, stored exactly as it was input. 
		 */
		BLOB("BLOB"),
		;
		private String value;
		
		DataType(String value) {
			this.value = value;
        }
		
		public String getValue(){
			return this.value;
		}
	}
	
	/**
	 * 表字段名<br>
	 */
	private final String name;
	/**
	 * 表字段数据类型<br>
	 */
	private final DataType datatype;
	
	/**
	 * 表字段数据约束<br>
	 */
	private final Constraints[] constraints;
	
	private Column(Builder builder){
		this.name = builder.name;
		this.datatype = builder.datatype;
		this.constraints = builder.constraints;
	}
	
	/** 
	 * ClassName: Builder <br/> 
	 * Function: 表字段建造者对象. <br/> 
	 * Reason: 在创建表字段的时候数据是唯一的，限制不可更改. <br/> 
	 * date: 2014年6月4日 下午5:47:24 <br/> 
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version 1.0.0 
	 */  
	public static class Builder{
		/**
		 * 表字段名<br>
		 */
		private String name;
		/**
		 * 表字段数据类型<br>
		 */
		private DataType datatype;
		
		/**
		 * 表字段约束
		 */
		private Constraints[] constraints;
		
		/** 
		 * Creates a new instance of Builder. 
		 * 
		 * @param name		表字段名<br>
		 * @param datatype 	表字段数据类型<br>
		 */  
		public Builder(String name, DataType datatype){
			this.name = name;
			this.datatype = datatype;
		}
		
		/**
		 * Description（描述）: 设置标字段数据约束<br/> 
		 * Conditions（适用条件）:<br/> 
		 * Execution flow（执行流程）:<br/> 
		 * Usage（用法）:<br/> 
		 * Cautions（注意事项）:<br/> 
		 * 
		 * @param constraints
		 * @return 
		 */ 
		public Builder setConstrains(Constraints... constraints){
			this.constraints = constraints;
			return Builder.this;
		}
		
		/**
		 * Description（描述）:	生成表字段对象<br/> 
		 * Conditions（适用条件）:<br/> 
		 * Execution flow（执行流程）:<br/> 
		 * Usage（用法）:<br/> 
		 * Cautions（注意事项）:<br/> 
		 * 
		 * @return 
		 */ 
		public Column build(){
			return new Column(this);
		}
	}

	/**
	 * Description（描述）: 获得当前表字段名<br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @return 
	 */ 
	public String getName() {
		return name;
	}

	/**
	 * Description（描述）:	获得当前表字段数据类型<br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @return 
	 */ 
	public DataType getDatatype() {
		return datatype;
	}

	
	/**
	 * Description（描述）: 获得当前表字段约束<br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @return 
	 */ 
	public Constraints[] getConstraints() {
		return constraints;
	}
	
}
