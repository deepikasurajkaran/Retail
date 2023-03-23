package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Search;
import com.example.demo.service.SearchService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/search")
public class SearchController {
	@Autowired
	private SearchService searchservice;

	public SearchController(SearchService searchservice) {
		super();
		this.searchservice = searchservice;
	}
	
	@GetMapping("/productname/{name}")
	public List<Search> getSearchproducts(@PathVariable("name") String name){
		return searchservice.getSearchproducts(name);
	}

}
