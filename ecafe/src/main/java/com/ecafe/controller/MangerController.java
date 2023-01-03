package com.ecafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.model.CafeComboModel;
import com.ecafe.model.CafeItemModel;
import com.ecafe.model.OfferModel;
import com.ecafe.service.IManagerService;

@RestController
@RequestMapping("/manager")
public class MangerController {
	@Autowired
	private IManagerService service;
	
	@PostMapping("/add")
	public CafeItem addCafeItem(@RequestBody CafeItem cafeitem) {
		CafeItem additem=this.service.addItem(cafeitem);
		return additem;
		}
	
	
	
	@PutMapping("/update")
	public CafeItem updateItem(@RequestBody CafeItemModel cafeitemmodel) {
		CafeItem updateitem=this.service.updateItem(cafeitemmodel);
		return updateitem;
		}
	

	@DeleteMapping("/delete")
	public CafeItem deleteCafeItem(@RequestBody CafeItem cafeitem) {
		CafeItem deleteitem=this.service.deleteItem(cafeitem);
		return deleteitem;
		
	}
	
	@PostMapping("/addcombo")
	public CafeCombo addCafeCombo(@RequestBody CafeCombo cafecombo) {
		CafeCombo addcombo=this.service.addCombo(cafecombo);
		return addcombo;
		}
	
	@PutMapping("/updatecombo")
	public CafeCombo updateCafeCombo(@RequestBody CafeComboModel cafecombomodel) {
		CafeCombo updatecombo=this.service.updateCombo(cafecombomodel);
		return updatecombo;
		}
	
	@DeleteMapping("/deletecombo")
	public CafeCombo deleteCafeCombo(@RequestBody CafeCombo cafecombo) {
		CafeCombo deletecombo=this.service.deleteCombo(cafecombo);
		return deletecombo;
		
	}
	
	
	@PostMapping("/addoffer")
	public Offer addOffer(@RequestBody Offer offer) {
		Offer addoffer=this.service.addOffer(offer);
		return offer;
		
	}
	
	
	@PutMapping("/updateoffer")
	public Offer  updateOffer(@RequestBody OfferModel offermodel) {
		Offer updateoffer=this.service.updateOffer(offermodel);
		return updateoffer;
	}
	
	
	@DeleteMapping("/deleteoffer")
	public Offer removeOffer(@RequestBody Offer offer) {
		Offer removeoffer=this.service.removeOffer(offer);
		return removeoffer;
		
	}

}
