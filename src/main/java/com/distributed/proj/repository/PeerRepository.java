package com.distributed.proj.repository;

import com.distributed.proj.model.Peer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeerRepository extends JpaRepository<Peer, String> {

}