package com.company.repclashsample;

import com.company.repclashsample.entity.Sample;
import com.company.repclashsample.plainrepo.JpaSampleRepo;
import com.company.repclashsample.repo.JmixSampleRepo;
import io.jmix.core.security.Authenticated;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;

@SpringBootTest
class RepclashsampleApplicationTests {

    @Autowired
    protected JmixSampleRepo jmixSampleRepo;

    @Autowired
    protected JpaSampleRepo jpaSampleRepo;

    @BeforeEach
    void createTestData() {
        Sample sample = jmixSampleRepo.create();
        sample.setName("test111");
        jmixSampleRepo.save(sample);

        sample = jmixSampleRepo.create();
        sample.setName("test222");
        jmixSampleRepo.save(sample);

        sample = jmixSampleRepo.create();
        sample.setName("sample111");
        jmixSampleRepo.save(sample);

        sample = jmixSampleRepo.create();
        sample.setName("sample222");
        jmixSampleRepo.save(sample);

    }

    @Test
    void contextLoads() {
        System.out.println("Jmix repo entities count: " + jmixSampleRepo.count());
        System.out.println("Jpa repo entities count: " + jpaSampleRepo.count());
    }

    @AfterEach
    void clearTestData() {
        jmixSampleRepo.deleteAll();
    }

}
