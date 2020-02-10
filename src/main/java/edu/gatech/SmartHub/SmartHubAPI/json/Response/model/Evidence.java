package edu.gatech.SmartHub.SmartHubAPI.json.Response.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Evidence {
	@JsonProperty("displayType")
	private String displayType;
	@JsonProperty("title")
	private String title;
	@JsonProperty("subtitle")
	private String subtitle;
	@JsonProperty("cols")
	private List<Col> cols;
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public List<Col> getCols() {
		return cols;
	}
	public void setCols(List<Col> cols) {
		this.cols = cols;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cols == null) ? 0 : cols.hashCode());
		result = prime * result + ((displayType == null) ? 0 : displayType.hashCode());
		result = prime * result + ((subtitle == null) ? 0 : subtitle.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Evidence other = (Evidence) obj;
		if (cols == null) {
			if (other.cols != null)
				return false;
		} else if (!cols.equals(other.cols))
			return false;
		if (displayType == null) {
			if (other.displayType != null)
				return false;
		} else if (!displayType.equals(other.displayType))
			return false;
		if (subtitle == null) {
			if (other.subtitle != null)
				return false;
		} else if (!subtitle.equals(other.subtitle))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Evidence {\n");
	    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
	    sb.append("    title: ").append(toIndentedString(title)).append("\n");
	    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
	    sb.append("    cols: ").append(toIndentedString(cols)).append("\n");
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
