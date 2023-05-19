package com.Test.demo.ServiceOrd;

import com.Test.demo.EntityOrder.OrdEntity;
import com.Test.demo.RepoOrd.OrdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdService {

    @Autowired
    private OrdRepo  ordRepo;

    public OrdEntity inputOrd (OrdEntity ordEntity){
        return ordRepo.save(ordEntity);
    }

    public Optional<OrdEntity> getOrdById(Integer id) throws Exception{
        return ordRepo.findById(id);
    }

    public List<OrdEntity> getAllOrd() throws Exception{
        return ordRepo.findAll();
    }

    public OrdEntity updateOrdById(Integer id, OrdEntity dto){
        Optional<OrdEntity> udt = ordRepo.findById(id);

        OrdEntity ordEntity = udt.get();
        ordEntity.setCustomerID(dto.getCustomerID());
        ordEntity.setTotalPrice(dto.getTotalPrice());
        ordEntity.setCreatedAt(dto.getCreatedAt());

        return ordRepo.save(ordEntity);
    }

    public void deleteOrdById(Integer id){
        ordRepo.deleteById(id);
    }

}
