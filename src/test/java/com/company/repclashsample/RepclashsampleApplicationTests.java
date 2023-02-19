package com.company.repclashsample;

import com.company.repclashsample.entity.Sample;
import com.company.repclashsample.plainrepo.JpaSampleRepo;
import io.jmix.core.UnconstrainedDataManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RepclashsampleApplicationTests {

    //@Autowired
    //protected JmixSampleRepo jmixSampleRepo;

    @Autowired
    protected JpaSampleRepo jpaSampleRepo;

    @Autowired
    protected UnconstrainedDataManager dataManager;

    @BeforeEach
    void createTestData() {
        Sample sample = dataManager.create(Sample.class);
        sample.setName("test111");
        dataManager.save(sample);

        sample = dataManager.create(Sample.class);
        sample.setName("test222");
        dataManager.save(sample);

        sample = dataManager.create(Sample.class);
        sample.setName("sample111");
        dataManager.save(sample);

        sample = dataManager.create(Sample.class);
        sample.setName("sample222");
        dataManager.save(sample);

    }

    @Test
    void contextLoads() {
        //System.out.println("Jmix repo entities count: " + jmixSampleRepo.count());
        System.out.println("Jpa repo entities count: " + jpaSampleRepo.count());
    }

    @AfterEach
    void clearTestData() {
        jpaSampleRepo.deleteAll();//wrong usage because jmix mechanisms will not be triggered, but it is ok for particular "Sample" entity
    }

}
