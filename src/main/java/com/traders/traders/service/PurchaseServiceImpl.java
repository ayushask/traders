package com.traders.traders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traders.traders.dto.Purchase;
import com.traders.traders.repository.PurchaseRepository;

@Service
public class PurchaseServiceImpl implements PurchaseService  {
    private PurchaseRepository purchaseRepository;

    @Autowired
    public void setPurchaseRepository(PurchaseRepository purchaseRepo) {
        this.purchaseRepository = purchaseRepo;
    }

    @Override
    public Iterable<Purchase> listAllPurchase() {
        return purchaseRepository.findAll();
    }

 

	@Override
	public void deleteProdutById(Integer id) {
         purchaseRepository.deleteById(id);
	}

	@Override
	public Purchase getPurchaseBuId(Integer id) {
        return purchaseRepository.findById(id).orElse(null);
	}

	@Override
	public Purchase savePurchase(Purchase purchase) {
        return purchaseRepository.save(purchase);

	}
    
    
}
