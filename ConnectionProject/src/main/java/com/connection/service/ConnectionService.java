package com.connection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connection.entity.Connection;
import com.connection.repository.ConnectionRepository;

@Service
public class ConnectionService {

	@Autowired
	ConnectionRepository connectionRepository;
	
	public Connection saveConnection(Connection con) {
		Connection createCon = connectionRepository.save(con);
		return createCon;
	}
	
}
