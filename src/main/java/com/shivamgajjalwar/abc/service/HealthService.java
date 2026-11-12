package com.shivamgajjalwar.abc.service;

import com.shivamgajjalwar.abc.dto.HealthResponse;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthResponse getHealth() {
        return new HealthResponse("UP");
    }
}
