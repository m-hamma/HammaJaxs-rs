package com.hamma.services.impl;


import org.jvnet.hk2.annotations.Service;

import com.hamma.model.dao.CategorieDao;
import com.hamma.services.CategorieService;

import jakarta.inject.Inject;
@Service
public class CategorieServiceImpl implements CategorieService {
	@Inject
	CategorieDao categorieDao;
	public String lister() {
		return "Bonjour";
	}
}
