package com.devgustavodaniel.gestaodefreelancer.service;

import com.devgustavodaniel.gestaodefreelancer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustumerService {

    private CustomerRepository customerRepository;


}
