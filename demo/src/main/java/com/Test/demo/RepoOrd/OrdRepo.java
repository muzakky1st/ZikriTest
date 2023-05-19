package com.Test.demo.RepoOrd;

import com.Test.demo.EntityOrder.OrdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdRepo extends JpaRepository<OrdEntity, Integer> {
}
