package com.cristian.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.beans.dao.AdminDao;
import com.cristian.beans.pojo.Admin;

@Service
public class AdminService {

	@Autowired
	
	private AdminDao dao;
	
	
	public boolean save(Admin admin) {
		
		admin.setFechaCreacion(new Timestamp(new Date().getTime()));
		
		return dao.save(admin);
		
	}
}
