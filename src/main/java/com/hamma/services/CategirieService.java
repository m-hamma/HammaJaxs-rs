package com.hamma.services;
//@Service

import org.jvnet.hk2.annotations.Service;

import com.hamma.model.dao.CategorieDao;

import jakarta.inject.Inject;
@Service
public class CategirieService {
	@Inject
	CategorieDao categorieDao;

}
