package com.example.calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
int sum(int a, int b){
 return a + b;
 }
}

