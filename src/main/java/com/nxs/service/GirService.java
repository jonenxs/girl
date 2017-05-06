package com.nxs.service;

import com.nxs.domain.Girl;
import com.nxs.Repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 57014 on 2017/3/24.
 */
@Service
public class GirService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(21);
        girlRepository.save(girlA);

        Girl girlB  = new Girl();
        girlB.setAge(22);
        girlB.setCupSize("B");
        girlRepository.save(girlB);
    }
}
