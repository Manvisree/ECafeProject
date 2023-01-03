package com.ecafe.service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.model.CafeComboModel;
import com.ecafe.model.CafeItemModel;
import com.ecafe.model.OfferModel;

public interface IManagerService {
	public CafeItem addItem(CafeItem cafeitem);
	public CafeCombo addCombo(CafeCombo cafecombo);
	public Offer addOffer(Offer offer);
	public CafeItem updateItem(CafeItemModel cafeitemmodel);
	public CafeCombo updateCombo(CafeComboModel cafecombomodel);
	public CafeItem deleteItem(CafeItem cafeItem);
	public CafeCombo deleteCombo(CafeCombo cafecombo);
	public Offer updateOffer(OfferModel offermodel);
	public Offer removeOffer(Offer removeoffer);
	

}
