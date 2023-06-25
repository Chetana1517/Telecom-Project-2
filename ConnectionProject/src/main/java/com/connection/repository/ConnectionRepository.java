package com.connection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connection.entity.Connection;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, String> {

}
