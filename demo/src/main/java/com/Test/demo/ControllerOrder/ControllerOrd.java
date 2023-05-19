package com.Test.demo.ControllerOrder;

import com.Test.demo.EntityOrder.OrdEntity;
import com.Test.demo.ServiceOrd.OrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerOrd {

    @Autowired
    private OrdService ordService;

    @RequestMapping("/order")
    public String order(){
        return "Home Page Order";
    }

    @PostMapping("input-order/order")
    public OrdEntity inputOrd(@RequestBody OrdEntity ordEntity){
        return ordService.inputOrd(ordEntity);
    }
    @GetMapping("/get/orders/{id}")
    public Optional<OrdEntity> getOrdtById(@PathVariable("id") Integer id) throws Exception{
        return ordService.getOrdById(id);
    }

    @GetMapping("/get/AllOrderss")
    public List<OrdEntity> getAllOrd()throws Exception{
        return ordService.getAllOrd();
    }

    @PutMapping("/update-order/{id}")
    public OrdEntity updateOrdById(@RequestBody OrdEntity ordEntity, @PathVariable("id") Integer id){
        return ordService.updateOrdById(id, ordEntity);
    }

    @DeleteMapping("/delete-order/{id}")
    public String deleteOrdById(@PathVariable("id") Integer id){
        ordService.deleteOrdById(id);
        return "Deleted Has Been Success";
    }

}
