package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Search;
import com.example.demo.repository.SearchRepo;
import com.example.demo.service.SearchService;
@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchRepo searchrepo;
	
	

	public SearchServiceImpl(SearchRepo searchrepo) {
		super();
		this.searchrepo = searchrepo;
	}



	@Override
	public List<Search> getSearchproducts(String name) {
		
		return searchrepo.getproducts(name);
	}

}
