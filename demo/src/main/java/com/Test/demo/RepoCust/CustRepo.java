package com.Test.demo.RepoCust;

import com.Test.demo.EntityCustomer.CustEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRepo extends JpaRepository<CustEntity, Integer> {
}
