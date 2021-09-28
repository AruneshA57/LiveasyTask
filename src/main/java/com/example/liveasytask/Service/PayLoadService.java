package com.example.liveasytask.Service;

import com.example.liveasytask.Modal.PayLoad;
import com.example.liveasytask.Repository.PayLoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PayLoadService {

    public final PayLoadRepository payLoadRepository ;
    @Autowired
    public PayLoadService(PayLoadRepository payLoadRepository) {
        this.payLoadRepository = payLoadRepository;
    }

    public PayLoad addPayLoad (PayLoad payLoad){
        payLoad.setShipperId(UUID.randomUUID().toString());
        return payLoadRepository.save(payLoad);
    }

    public PayLoad findPayLoadByShipperId(String shipperId){
        return payLoadRepository.findPayLoadByShipperId(shipperId);
    }

    public List<PayLoad> findPayLoadByLoadingPoint(String loadingPoint){
        return payLoadRepository.findPayLoadByLoadingPoint(loadingPoint);
    }

    public PayLoad updatePayLoad(PayLoad payLoad){
        return payLoadRepository.save(payLoad);
    }

    public void deletePayLoadByShipperId(String shipperId){
        payLoadRepository.deletePayLoadByShipperId(shipperId);
    }


}
