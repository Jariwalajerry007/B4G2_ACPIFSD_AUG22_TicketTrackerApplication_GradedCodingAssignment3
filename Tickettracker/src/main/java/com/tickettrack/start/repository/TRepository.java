package com.tickettrack.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tickettrack.start.entity.TEntity;

@Repository
public interface TRepository extends JpaRepository<TEntity, Long>{

}
