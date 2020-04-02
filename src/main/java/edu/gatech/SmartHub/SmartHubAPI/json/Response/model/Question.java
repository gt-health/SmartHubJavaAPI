package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Question {
	@JsonProperty("number")
	private String number;
	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private String type;
	@JsonProperty("autofill")
	private Autofill autofill;
	@JsonProperty("options")
	private List<Option> options;
	@JsonProperty("value")
	private String value;
	@JsonProperty("evidence")
	private String evidence;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Autofill getAutofill() {
		return autofill;
	}
	public void setAutofill(Autofill autofill) {
		this.autofill = autofill;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autofill == null) ? 0 : autofill.hashCode());
		result = prime * result + ((evidence == null) ? 0 : evidence.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Question other = (Question) obj;
		if (autofill == null) {
			if (other.autofill != null)
				return false;
		} else if (!autofill.equals(other.autofill))
			return false;
		if (evidence == null) {
			if (other.evidence != null)
				return false;
		} else if (!evidence.equals(other.evidence))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Question {\n");
	    sb.append("    number: ").append(toIndentedString(number)).append("\n");
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    type: ").append(toIndentedString(type)).append("\n");
	    sb.append("    autofill: ").append(toIndentedString(autofill)).append("\n");
	    sb.append("    options: ").append(toIndentedString(options)).append("\n");
	    sb.append("    value: ").append(toIndentedString(value)).append("\n");
	    sb.append("    evidence: ").append(toIndentedString(value)).append("\n");
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
