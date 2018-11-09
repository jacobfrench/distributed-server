package com.distributed.proj.service;

import java.util.ArrayList;
import java.util.List;

import com.distributed.proj.model.Peer;
import com.distributed.proj.repository.PeerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeerService {

  @Autowired
  private PeerRepository peerRepository;

  public List<Peer> getAllPeers(){
    List<Peer> peers = new ArrayList<>();
    peerRepository.findAll().forEach(peers::add);
    return peers;
  }

  public void postPeer(Peer peer){
    peerRepository.save(peer);
  }


}