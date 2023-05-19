package com.Test.demo.ControllerCustomer;

import com.Test.demo.EntityCustomer.CustEntity;
import com.Test.demo.ServiceCust.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCust {

    @Autowired
    private CustService custService;

    @RequestMapping("/customer")
    public String customer(){
        return "Page Customer";
    }

    @PostMapping("/input/customers")
    public CustEntity inputCust (@RequestBody CustEntity custEntity){
        return custService.inputCust(custEntity);
    }

    @GetMapping("/get/customers/{id}")
    public Optional<CustEntity>getCustById(@PathVariable("id") Integer id) throws Exception{
        return custService.getCustById(id);
    }

    @GetMapping("/get/AllCustomers")
    public List<CustEntity>getAllCust()throws Exception{
        return custService.getAllCust();
    }

    @PutMapping("/update-customer/{id}")
    public CustEntity updateCustById(@RequestBody CustEntity custEntity, @PathVariable("id") Integer id){
        return custService.updateCustById(id, custEntity);
    }

    @DeleteMapping("/delete-customer/{id}")
    public String deleteCustById(@PathVariable("id") Integer id){
        custService.deleteCustById(id);
        return "Deleted Has Been Success";
    }
}
