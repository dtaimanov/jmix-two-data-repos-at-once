package com.company.repclashsample.repo;

import com.company.repclashsample.entity.Sample;

import java.util.List;

/**
 * temporary disabled. not a repository
 */
//@ApplyConstraints(false)
public interface JmixSampleRepo/* extends JmixDataRepository<Sample, UUID> */ {

    List<Sample> getSamplesByName(String name);


}
