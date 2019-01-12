package com.example.calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Main Spring Application.
 */
@Service
public class Calculator {
int sum(int a, int b){
 return a + b;
 }
}

