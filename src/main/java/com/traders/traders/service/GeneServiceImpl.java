//package com.traders.traders.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.traders.traders.dto.Genes;
//import com.traders.traders.repository.GenesRepostiory;
//
//@Service
//public class GeneServiceImpl implements GeneService {
//	private GenesRepostiory genesRepository;
//
//	@Autowired
//	public void setGenesRepository(GenesRepostiory GenesRepository) {
//		this.genesRepository = GenesRepository;
//	}
//
//	@Overridea
//	public Iterable<Genes> listAllGeness() {
//		return genesRepository.findAll();
//	}
//
//	@Override
//	public Genes getGenesById(Integer id) {
//		return genesRepository.findById(id).orElse(null);
//	}
//
//	@Override
//	public Genes saveGenes(Genes Genes) {
//		return genesRepository.save(Genes);
//	}
//
//	@Override
//	public void deleteProdutById(Integer id) {
//		genesRepository.deleteById(id);
//	}
//
//}
