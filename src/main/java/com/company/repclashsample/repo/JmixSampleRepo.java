package com.company.repclashsample.repo;

import com.company.repclashsample.entity.Sample;
import io.jmix.core.repository.ApplyConstraints;
import io.jmix.core.repository.JmixDataRepository;

import java.util.List;
import java.util.UUID;

@ApplyConstraints(false)
public interface JmixSampleRepo extends JmixDataRepository<Sample, UUID> {

    List<Sample> getSamplesByName(String name);


}
