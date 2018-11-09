package com.distributed.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.distributed.proj.service.*;


import com.distributed.proj.model.Peer;

@RestController
public class PeerController {

	@Autowired
	private PeerService peerService;
	
	@GetMapping("/get/peers")
	public List<Peer> getPeers(){
		return peerService.getAllPeers();
	}

	@PostMapping("/post/peer")
	public void postPeer(@RequestBody Peer peer){
		peerService.postPeer(peer);
	}

}
