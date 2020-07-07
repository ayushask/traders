package com.traders.traders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traders.traders.dto.Stocks;
import com.traders.traders.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {
	private StockRepository StockRepository;

	@Autowired
	public void setStockRepository(StockRepository StockRepository) {
		this.StockRepository = StockRepository;
	}

	@Override
	public Stocks getStocksById(Integer id) {
		return StockRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteProdutById(Integer id) {
		StockRepository.deleteById(id);
	}

	@Override
	public Iterable<Stocks> listAllStockss() {
		return StockRepository.findAll();
	}

	@Override
	public Stocks saveStocks(Stocks Stocks) {
		return StockRepository.save(Stocks);
	}

}
