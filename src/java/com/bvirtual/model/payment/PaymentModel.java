/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvirtual.model.payment;

import java.io.Serializable;
import com.bvirtual.webservice.EntityModel;

/**
 *
 * @author Bsystems
 */
public class PaymentModel implements EntityModel, Serializable {

    String apiKey;
    String applicationName;
    String country;
    String bank;
    String thirdPartyProcessor;
    String paymentGateway;

    String transactionReferenceId;
    String transactionDate;
    String transactionDescription;
    String transactionAmount;
    String transactionType;
    String transactionFee;
    String transactionStatus;
    String transactionRemarks;

    String mobileNetwork;
    String mobileNumber;
    String mobileAccountHolderName;
    String mobileCharges;
    String mobileReferenceCode;

    String bankCode;
    String bankName;
    String accountNumber;
    String accountName;
    String bankCharge;
    String bankReferenceCode;
    String lastUpdateDate;

    public PaymentModel(String applicationName, String country, String bank, String thirdPartyProcessor, String paymentGateway, String transactionReferenceId, String transactionDate, String transactionDescription, String transactionAmount, String transactionType, String transactionFee, String transactionStatus, String transactionRemarks, String mobileNetwork, String mobileNumber, String mobileAccountHolderName, String mobileCharges, String mobileReferenceCode, String bankCode, String bankName, String accountNumber, String accountName, String bankCharge, String bankReferenceCode, String lastUpdateDate, String apiKey) {
        this.applicationName = applicationName;
        this.country = country;
        this.bank = bank;
        this.thirdPartyProcessor = thirdPartyProcessor;
        this.paymentGateway = paymentGateway;
        this.transactionReferenceId = transactionReferenceId;
        this.transactionDate = transactionDate;
        this.transactionDescription = transactionDescription;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.transactionFee = transactionFee;
        this.transactionStatus = transactionStatus;
        this.transactionRemarks = transactionRemarks;
        this.mobileNetwork = mobileNetwork;
        this.mobileNumber = mobileNumber;
        this.mobileAccountHolderName = mobileAccountHolderName;
        this.mobileCharges = mobileCharges;
        this.mobileReferenceCode = mobileReferenceCode;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.bankCharge = bankCharge;
        this.bankReferenceCode = bankReferenceCode;
        this.lastUpdateDate = lastUpdateDate;
        this.apiKey = apiKey;
    }

    public PaymentModel(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public PaymentModel() {

    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getThirdPartyProcessor() {
        return thirdPartyProcessor;
    }

    public void setThirdPartyProcessor(String thirdPartyProcessor) {
        this.thirdPartyProcessor = thirdPartyProcessor;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(String transactionFees) {
        this.transactionFee = transactionFees;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionRemarks() {
        return transactionRemarks;
    }

    public void setTransactionRemarks(String transactionRemarks) {
        this.transactionRemarks = transactionRemarks;
    }

    public String getMobileNetwork() {
        return mobileNetwork;
    }

    public void setMobileNetwork(String mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileAccountHolderName() {
        return mobileAccountHolderName;
    }

    public void setMobileAccountHolderName(String mobileAccountHolderName) {
        this.mobileAccountHolderName = mobileAccountHolderName;
    }

    public String getMobileCharges() {
        return mobileCharges;
    }

    public void setMobileCharges(String mobileCharges) {
        this.mobileCharges = mobileCharges;
    }

    public String getMobileReferenceCode() {
        return mobileReferenceCode;
    }

    public void setMobileReferenceCode(String mobileReferenceCode) {
        this.mobileReferenceCode = mobileReferenceCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankCharge() {
        return bankCharge;
    }

    public void setBankCharge(String bankCharge) {
        this.bankCharge = bankCharge;
    }

    public String getBankReferenceCode() {
        return bankReferenceCode;
    }

    public void setBankReferenceCode(String bankReferenceCode) {
        this.bankReferenceCode = bankReferenceCode;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}
