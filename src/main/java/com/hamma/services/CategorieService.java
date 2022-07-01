package com.hamma.services;
//@Service

import org.jvnet.hk2.annotations.Contract;
import org.jvnet.hk2.annotations.Service;

import com.hamma.model.dao.CategorieDao;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
@Contract
public interface CategorieService {
	public String lister();
}
