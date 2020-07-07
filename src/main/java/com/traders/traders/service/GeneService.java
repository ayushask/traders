package com.traders.traders.service;

import com.traders.traders.dto.Genes;

public interface GeneService {
	Iterable<Genes> listAllGeness();

	Genes getGenesById(Integer id);

	Genes saveGenes(Genes Genes);

	void deleteProdutById(Integer Genes);
}
