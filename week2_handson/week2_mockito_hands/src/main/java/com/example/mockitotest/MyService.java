package com.example.mockitotest;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData(); // Will return mocked value in test
    }
}
