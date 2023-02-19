package com.company.repclashsample.plainrepo;

import com.company.repclashsample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface JpaSampleRepo extends JpaRepository<Sample, UUID> {
    List<Sample> findByName(String name);
}
