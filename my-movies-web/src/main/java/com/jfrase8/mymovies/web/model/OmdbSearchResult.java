package com.jfrase8.mymovies.web.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OmdbSearchResult implements Serializable {
	private static final long serialVersionUID = -2021754512230648266L;

	@JsonProperty("Search")
	private List<OmdbMovie> movies;

	private int totalResults;

	public List<OmdbMovie> getMovies() {
		return movies;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setMovies(List<OmdbMovie> movies) {
		this.movies = movies;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
}
