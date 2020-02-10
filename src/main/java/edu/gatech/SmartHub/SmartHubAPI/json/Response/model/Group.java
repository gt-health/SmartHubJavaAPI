package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Group {
	@JsonProperty("name")
	private String name;
	@JsonProperty("questions")
	private Questions questions;
	@JsonProperty("evidences")
	private List<String> evidences;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Questions getQuestions() {
		return questions;
	}
	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
	public List<String> getEvidences() {
		return evidences;
	}
	public void setEvidences(List<String> evidences) {
		this.evidences = evidences;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((evidences == null) ? 0 : evidences.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((questions == null) ? 0 : questions.hashCode());
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
		Group other = (Group) obj;
		if (evidences == null) {
			if (other.evidences != null)
				return false;
		} else if (!evidences.equals(other.evidences))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Group {\n");
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
	    sb.append("    evidences: ").append(toIndentedString(evidences)).append("\n");
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
