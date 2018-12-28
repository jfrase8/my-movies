package com.jfrase8.mymovies.web.service;

import java.util.List;

import com.jfrase8.mymovies.web.model.OmdbMovie;

public interface IOmdbService {

	List<OmdbMovie> search(String query);
}
