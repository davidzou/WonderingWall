package com.wonderingwall.database.sql;

/**
 * ClassName: QueryArgument <br/>
 * Function: 数据库查询条件. <br/>
 * Reason: <br/>
 * date: 2014年5月22日 下午11:27:36 <br/>
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version 1.0.0
 */
public class QueryArgument {
	private final String where;
	private final String[] whereArg;
	// query params
	private final String groupBy;
	private final String having;
	private final String orderBy;

	private QueryArgument(Builder builder) {
		this.where = builder.where;
		this.whereArg = builder.whereArg;
		this.groupBy = builder.groupBy;
		this.having = builder.having;
		this.orderBy = builder.orderBy;
	}

	public static class Builder {
		private String where;
		private String[] whereArg;
		// query params
		private String groupBy;
		private String having;
		private String orderBy;

		public Builder() {
		}

		public Builder setWhere(String where) {
			this.where = where;
			return Builder.this;
		}

		public Builder setWhereArg(String[] whereArg) {
			this.whereArg = whereArg;
			return Builder.this;
		}

		public Builder setGroupBy(String groupBy) {
			this.groupBy = groupBy;
			return Builder.this;
		}

		public Builder setHaving(String having) {
			this.having = having;
			return Builder.this;
		}

		public Builder setOrderBy(String orderBy) {
			this.orderBy = orderBy;
			return Builder.this;
		}

		public QueryArgument build() {
			return new QueryArgument(this);
		}
	}

	public String getWhere() {
		return where;
	}

	public String[] getWhereArg() {
		return whereArg;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public String getHaving() {
		return having;
	}

	public String getOrderBy() {
		return orderBy;
	}

}
