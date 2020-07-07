package com.traders.traders.service;


import com.traders.traders.dto.Purchase;

public interface PurchaseService {
	Iterable<Purchase> listAllPurchase();

    Purchase getPurchaseBuId(Integer id);

    Purchase savePurchase(Purchase purchase);
    
    void deleteProdutById(Integer purchase);
}
