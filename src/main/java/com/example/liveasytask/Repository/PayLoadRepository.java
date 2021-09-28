package com.example.liveasytask.Repository;

import com.example.liveasytask.Modal.PayLoad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayLoadRepository extends JpaRepository<PayLoad, String> {
    PayLoad findPayLoadByShipperId(String ShipperId);
    List<PayLoad> findPayLoadByLoadingPoint(String loadingPoint);
    void deletePayLoadByShipperId(String ShipperId);








}
