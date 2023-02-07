package com.example.clevertecgit.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrayService {

    public List<String> getArrayList() {
        return List.of("a", "b", "c", "d");
    }
}