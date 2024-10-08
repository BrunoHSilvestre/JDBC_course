package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller department);
	void update(Seller department); 
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll(Integer id);
}
