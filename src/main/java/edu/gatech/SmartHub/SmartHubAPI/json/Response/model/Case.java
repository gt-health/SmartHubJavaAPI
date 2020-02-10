package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Case {
	@JsonProperty("value")
	private String value;
	@JsonProperty("queries")
	private List<Query> queries;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<Query> getQueries() {
		return queries;
	}
	public void setQueries(List<Query> queries) {
		this.queries = queries;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((queries == null) ? 0 : queries.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Case{\n");
	    
	    sb.append("    value: ").append(toIndentedString(value)).append("\n");
	    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
