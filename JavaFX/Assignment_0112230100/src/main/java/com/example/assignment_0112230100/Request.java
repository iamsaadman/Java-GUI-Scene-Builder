package com.example.assignment_0112230100;

import java.io.Serializable;

public class Request implements Serializable {
    private double num1;
    private double num2;
    private String operation;

    public Request(double num1, double num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }
}

class Response implements Serializable {
    private double result;

    public Response(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}

 class GetAllLogsRequest implements Serializable {

}
