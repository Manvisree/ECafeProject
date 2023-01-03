package com.ecafe.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecafe.entity.CafeCombo;
import com.ecafe.entity.CafeItem;
import com.ecafe.entity.Offer;
import com.ecafe.model.CafeComboModel;
import com.ecafe.model.CafeItemModel;
import com.ecafe.model.OfferModel;
import com.ecafe.repository.CafeComboRepository;
import com.ecafe.repository.CafeItemRepository;
import com.ecafe.repository.ManagerRepository;
import com.ecafe.repository.OfferRepository;
import com.ecafe.service.IManagerService;

@Service
public class ManagerServiceImpl  implements IManagerService{
	
	@Autowired
	private CafeItemRepository repo;
	@Autowired
	private CafeComboRepository comborepo;
	@Autowired
	private OfferRepository offerrepo;

	@Override
	public CafeItem addItem(CafeItem cafeitem) {
		// TODO Auto-generated method stub
		CafeItem save=this.repo.save(cafeitem);
		return save;
	}
	
	@Override
	public CafeCombo addCombo(CafeCombo cafecombo) {
		// TODO Auto-generated method stub
		CafeCombo save=this.comborepo.save(cafecombo);
		return save;
	}
	
	@Override
	public Offer addOffer(Offer offer) {
		// TODO Auto-generated method stub
		Offer save=this.offerrepo.save(offer);
		return save;
	}

	@Override
	public CafeItem updateItem(CafeItemModel cafeitemmodel) {
		// TODO Auto-generated method stub
		CafeItem cafeItem=new CafeItem();
		cafeItem.setItemId(cafeitemmodel.getItemId());
		cafeItem.setName(cafeitemmodel.getName());
		cafeItem.setImageUrl(cafeitemmodel.getImageUrl());;
		cafeItem.setType(cafeitemmodel.getType());
		cafeItem.setAmount(cafeitemmodel.getAmount());;
		return this.repo.save(cafeItem);
		
	}
	@Override
	public CafeCombo updateCombo(CafeComboModel cafecombomodel) {
		// TODO Auto-generated method stub
		CafeCombo cafecombo=new CafeCombo();
		cafecombo.setComboId(cafecombomodel.getComboId());
		cafecombo.setName(cafecombomodel.getName());
		cafecombo.setType(cafecombomodel.getType());
		cafecombo.setDetail(cafecombomodel.getDetail());
		cafecombo.setAmount(cafecombomodel.getAmount());
		cafecombo.setType(cafecombomodel.getType());
		return this.comborepo.save(cafecombo);
		
	}
	
	@Override
	public CafeItem deleteItem(CafeItem cafeItem) {
		// TODO Auto-generated method stub
		long id=cafeItem.getItemId();
		this.repo.deleteById(id);
		return cafeItem;
	}


	@Override
	public CafeCombo deleteCombo(CafeCombo cafecombo) {
		// TODO Auto-generated method stub
		long id=cafecombo.getComboId();
		this.comborepo.deleteById(id);
		return cafecombo;
	}
	


	@Override
	public Offer updateOffer(OfferModel offermodel) {
		// TODO Auto-generated method stub
		Offer offer=new Offer();
		offer.setOfferId(offermodel.getOfferId());
		offer.setDetial(offermodel.getDetial());
		offer.setEnables(offermodel.isEnables());
		offer.setOfferCode(offermodel.getOfferCode());
		offer.setOffertype(offermodel.getOffertype());
		offer.setOfferValue(offermodel.getOfferValue());
		offer.setValidTill(offermodel.getValidTill());
		return this.offerrepo.save(offer);
	}

	@Override
	public Offer removeOffer(Offer removeoffer) {
		// TODO Auto-generated method stub
		long id=removeoffer.getOfferId();
		this.offerrepo.deleteById(id);
		return removeoffer;
	}

	

	

	


	

}
