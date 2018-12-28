package com.jfrase8.mymovies.web.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OmdbMovie implements Serializable {
	private static final long serialVersionUID = -3767061918204007028L;

	@JsonProperty("imdbID")
	private String imdbId;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Year")
	private String year;

	@JsonProperty("Poster")
	private String poster;

	public String getImdbId() {
		return imdbId;
	}

	public String getPoster() {
		return poster;
	}

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return year;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
