package com.mrkid.dcevm.service;

import org.springframework.stereotype.Service;

/**
 * User: xudong
 * Date: 5/18/15
 * Time: 5:20 PM
 */
@Service
public class CalcService {
    public int calc(int a, int b) {
        return a * b + 100;
    }
}
