package com.Test.demo.ServiceCust;

import com.Test.demo.EntityCustomer.CustEntity;
import com.Test.demo.RepoCust.CustRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustService {

    @Autowired
    private CustRepo custRepo;

    public CustEntity inputCust (CustEntity custEntity){
        return custRepo.save(custEntity);
    }

    public Optional<CustEntity> getCustById(Integer id) throws Exception{
        return custRepo.findById(id);
    }

    public List<CustEntity>getAllCust() throws Exception{
        return custRepo.findAll();
    }

    public CustEntity updateCustById(Integer id, CustEntity dto){
        Optional<CustEntity> udt = custRepo.findById(id);

        CustEntity custEntity = udt.get();
        custEntity.setName(dto.getName());
        custEntity.setEmail(dto.getEmail());
        custEntity.setPhone(dto.getPhone());

        return custRepo.save(custEntity);
    }

    public void deleteCustById(Integer id){
        custRepo.deleteById(id);
    }

}
