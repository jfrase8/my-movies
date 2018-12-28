package com.jfrase8.mymovies.web.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jfrase8.mymovies.web.ApplicationProperties;
import com.jfrase8.mymovies.web.model.OmdbMovie;
import com.jfrase8.mymovies.web.model.OmdbSearchResult;

@Service
public class OmdbService implements IOmdbService {

	@Autowired
	private ApplicationProperties applicationProperties;

	private String buildSearchUrl(String query) {
		String url = null;
		try {
			url = String.format("%s/?apikey=%s&s=%s", applicationProperties.getOmdbBaseUrl(),
					applicationProperties.getOmdbKey(), URLEncoder.encode(query, StandardCharsets.UTF_8.toString()));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return url;
	}

	@Override
	public List<OmdbMovie> search(String query) {
		String url = buildSearchUrl(query);
		RestTemplate restTemplate = new RestTemplate();
		OmdbSearchResult apiResponse = restTemplate.getForObject(url, OmdbSearchResult.class);
		List<OmdbMovie> movies = apiResponse.getMovies();
		return movies;
	}
}
