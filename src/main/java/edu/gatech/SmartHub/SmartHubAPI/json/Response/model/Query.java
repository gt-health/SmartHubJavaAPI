package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Query {
	@JsonProperty("field")
	private String field;
	@JsonProperty("operator")
	private String operator;
	@JsonProperty("criteria")
	private String criteria;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((criteria == null) ? 0 : criteria.hashCode());
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Query other = (Query) obj;
		if (criteria == null) {
			if (other.criteria != null)
				return false;
		} else if (!criteria.equals(other.criteria))
			return false;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		return true;
	}
	
	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Query{\n");
	    
	    sb.append("    field: ").append(toIndentedString(field)).append("\n");
	    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
	    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
}