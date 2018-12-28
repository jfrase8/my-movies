package com.jfrase8.mymovies.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class ApplicationProperties {

	private String omdbKey;
	private String omdbBaseUrl;

	public String getOmdbBaseUrl() {
		return omdbBaseUrl;
	}

	public String getOmdbKey() {
		return omdbKey;
	}

	public void setOmdbBaseUrl(String omdbBaseUrl) {
		this.omdbBaseUrl = omdbBaseUrl;
	}

	public void setOmdbKey(String omdbKey) {
		this.omdbKey = omdbKey;
	}
}
