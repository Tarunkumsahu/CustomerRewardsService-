package com.example.demo.model;

import java.time.LocalDate;

public class Transaction {

    private Long customerId;
    private Double transactionAmount;
    private LocalDate date;
    private Integer pointsEarned;
    private Integer firstMonthTotal;
    private Integer secondMonthTotal;
    private Integer thirdMonthTotal;
    private Integer threeMonthTotalPoints;

    // Default constructor
    public Transaction() {
    }

    // Constructor with parameters
    public Transaction(Long customerId, Double transactionAmount, LocalDate date, Integer pointsEarned,
                       Integer firstMonthTotal, Integer secondMonthTotal, Integer thirdMonthTotal, Integer threeMonthTotalPoints) {
        this.customerId = customerId;
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.pointsEarned = pointsEarned;
        this.firstMonthTotal = firstMonthTotal;
        this.secondMonthTotal = secondMonthTotal;
        this.thirdMonthTotal = thirdMonthTotal;
        this.threeMonthTotalPoints = threeMonthTotalPoints;
    }

    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(Integer pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public Integer getFirstMonthTotal() {
        return firstMonthTotal;
    }

    public void setFirstMonthTotal(Integer firstMonthTotal) {
        this.firstMonthTotal = firstMonthTotal;
    }

    public Integer getSecondMonthTotal() {
        return secondMonthTotal;
    }

    public void setSecondMonthTotal(Integer secondMonthTotal) {
        this.secondMonthTotal = secondMonthTotal;
    }

    public Integer getThirdMonthTotal() {
        return thirdMonthTotal;
    }

    public void setThirdMonthTotal(Integer thirdMonthTotal) {
        this.thirdMonthTotal = thirdMonthTotal;
    }

    public Integer getThreeMonthTotalPoints() {
        return threeMonthTotalPoints;
    }

    public void setThreeMonthTotalPoints(Integer threeMonthTotalPoints) {
        this.threeMonthTotalPoints = threeMonthTotalPoints;
    }
}
