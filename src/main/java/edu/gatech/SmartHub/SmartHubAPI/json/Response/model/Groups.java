package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Groups {
	@JsonProperty("byId")
	private Map<String,Object> byId;
	@JsonProperty("allIds")
	private List<String> allIds;
	
	public Map<String, Object> getById() {
		return byId;
	}
	public void setById(Map<String, Object> byId) {
		this.byId = byId;
	}
	public List<String> getAllIds() {
		return allIds;
	}
	public void setAllIds(List<String> allIds) {
		this.allIds = allIds;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allIds == null) ? 0 : allIds.hashCode());
		result = prime * result + ((byId == null) ? 0 : byId.hashCode());
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
		Groups other = (Groups) obj;
		if (allIds == null) {
			if (other.allIds != null)
				return false;
		} else if (!allIds.equals(other.allIds))
			return false;
		if (byId == null) {
			if (other.byId != null)
				return false;
		} else if (!byId.equals(other.byId))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Groups {\n");
	    sb.append("    allIds: ").append(toIndentedString(allIds)).append("\n");
	    sb.append("    byId: ").append(toIndentedString(byId)).append("\n");
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
