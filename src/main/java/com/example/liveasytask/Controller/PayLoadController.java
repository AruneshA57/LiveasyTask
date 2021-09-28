package com.example.liveasytask.Controller;

import com.example.liveasytask.Modal.PayLoad;
import com.example.liveasytask.Service.PayLoadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Load")
public class PayLoadController {
    public final PayLoadService payLoadService;

    public PayLoadController(PayLoadService payLoadService) {
        this.payLoadService = payLoadService;
    }

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        String s = "helloWorld";
        return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/find")
    public ResponseEntity<PayLoad> getPayLoadByShipperId(@RequestParam String shipperId){
        PayLoad newLoad = payLoadService.findPayLoadByShipperId(shipperId);
        return new ResponseEntity<>(newLoad, HttpStatus.OK);
    }

    @GetMapping(value = "/loading")
    public ResponseEntity<List<PayLoad>> getPayLoadByLoadingPoint(@RequestParam String loadingPoint){
        List<PayLoad> newLoads = payLoadService.findPayLoadByLoadingPoint(loadingPoint);
        return new ResponseEntity<>(newLoads,HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<PayLoad> updatePayLoad(@RequestBody PayLoad payLoad){
        PayLoad updateLoad = payLoadService.updatePayLoad(payLoad);
        return new ResponseEntity<>(updateLoad,HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<PayLoad> addPayLoad(@RequestBody PayLoad payLoad){
        PayLoad newLoad = payLoadService.addPayLoad(payLoad);
        return new ResponseEntity<>(newLoad, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<String> delete(@RequestParam String shipperId){
        payLoadService.deletePayLoadByShipperId(shipperId);
        return new ResponseEntity<>("PayLoad details Deleted", HttpStatus.OK);
    }

}
//33c1f0d4-aa61-4593-bf29-0fae337c87e0
//ebf7edfa-96cd-4fd0-b8f3-ed6fec7d5dfd