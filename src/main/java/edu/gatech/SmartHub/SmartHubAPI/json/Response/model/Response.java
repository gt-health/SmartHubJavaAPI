package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	@JsonProperty("name")
	private String name;
	@JsonProperty("slug")
	private String slug;
	@JsonProperty("groups")
	private Groups groups;
	@JsonProperty("evidences")
	private Map<String, Evidences> evidences;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public Groups getGroups() {
		return groups;
	}
	public void setGroups(Groups groups) {
		this.groups = groups;
	}
	public Map<String, Evidences> getEvidences() {
		return evidences;
	}
	public void setEvidences(Map<String, Evidences> evidences) {
		this.evidences = evidences;
	}
	
	public Map<String, String> mapQuestionNamesToValue() {
		return groups.mapQuestionNamesToValue();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((evidences == null) ? 0 : evidences.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((slug == null) ? 0 : slug.hashCode());
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
		Response other = (Response) obj;
		if (evidences == null) {
			if (other.evidences != null)
				return false;
		} else if (!evidences.equals(other.evidences))
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (slug == null) {
			if (other.slug != null)
				return false;
		} else if (!slug.equals(other.slug))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Response {\n");
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
	    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
