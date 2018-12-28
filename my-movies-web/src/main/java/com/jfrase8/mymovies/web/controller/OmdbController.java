package com.jfrase8.mymovies.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jfrase8.mymovies.web.model.OmdbMovie;
import com.jfrase8.mymovies.web.service.IOmdbService;

@Controller
public class OmdbController {

	@Autowired
	private IOmdbService omdbService;

	@RequestMapping(value = "/api/omdb/test", method = RequestMethod.GET)
	public List<OmdbMovie> getTest() {

		return omdbService.search("lost");
	}

	@RequestMapping(value = "/api/omdb/search", method = RequestMethod.GET)
	@ResponseBody
	public List<OmdbMovie> search(@RequestParam("q") String searchText) {
		List<OmdbMovie> results = omdbService.search(searchText);
		return results;
	}

}
