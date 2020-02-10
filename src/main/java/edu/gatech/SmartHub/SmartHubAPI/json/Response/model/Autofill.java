package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Autofill {
	@JsonProperty("default")
	private String defaultProperty;
	@JsonProperty("cases")
	private List<Case> cases;
	public String getDefaultProperty() {
		return defaultProperty;
	}
	public void setDefaultProperty(String defaultProperty) {
		this.defaultProperty = defaultProperty;
	}
	public List<Case> getCases() {
		return cases;
	}
	public void setCases(List<Case> cases) {
		this.cases = cases;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cases == null) ? 0 : cases.hashCode());
		result = prime * result + ((defaultProperty == null) ? 0 : defaultProperty.hashCode());
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
		Autofill other = (Autofill) obj;
		if (cases == null) {
			if (other.cases != null)
				return false;
		} else if (!cases.equals(other.cases))
			return false;
		if (defaultProperty == null) {
			if (other.defaultProperty != null)
				return false;
		} else if (!defaultProperty.equals(other.defaultProperty))
			return false;
		return true;
	}
	
	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Autofill{\n");
	    
	    sb.append("    property: ").append(toIndentedString(defaultProperty)).append("\n");
	    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
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