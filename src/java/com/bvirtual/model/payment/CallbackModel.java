/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvirtual.model.payment;

import com.bvirtual.webservice.EntityModel;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bsystems
 */

public class CallbackModel implements EntityModel {

    String paymentGateway;
    String referenceId;
    String callbackDate;
    String amountDebited;
    String transactionFeeCharged;
    String amountAftercharges;
    String merchantAccountBalance;
    String description;
    String referenceCode;
    String providerReferenceCode;
    String otherReferenceCode;
    String remarks;

    ArrayList list = null;

    public CallbackModel(String paymentGateway, String referenceId, String callbackDate, String amountDebited, String transactionFeeCharged, String amountAftercharges, String merchantAccountBalance, String description, String referenceCode, String providerReferenceCode, String otherReferenceCode, String remarks) {
        this.paymentGateway = paymentGateway;
        this.referenceId = referenceId;
        this.callbackDate = callbackDate;
        this.amountDebited = amountDebited;
        this.transactionFeeCharged = transactionFeeCharged;
        this.amountAftercharges = amountAftercharges;
        this.merchantAccountBalance = merchantAccountBalance;
        this.description = description;
        this.referenceCode = referenceCode;
        this.providerReferenceCode = providerReferenceCode;
        this.otherReferenceCode = otherReferenceCode;
        this.remarks = remarks;
    }

    public CallbackModel() {
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getCallbackDate() {
        return callbackDate;
    }

    public void setCallbackDate(String callbackDate) {
        this.callbackDate = callbackDate;
    }

    public String getAmountDebited() {
        return amountDebited;
    }

    public void setAmountDebited(String amountDebited) {
        this.amountDebited = amountDebited;
    }

    public String getTransactionFeeCharged() {
        return transactionFeeCharged;
    }

    public void setTransactionFeeCharged(String transactionFeeCharged) {
        this.transactionFeeCharged = transactionFeeCharged;
    }

    public String getAmountAftercharges() {
        return amountAftercharges;
    }

    public void setAmountAftercharges(String AmountAftercharges) {
        this.amountAftercharges = AmountAftercharges;
    }

    public String getMerchantAccountBalance() {
        return merchantAccountBalance;
    }

    public void setMerchantAccountBalance(String merchantAccountBalance) {
        this.merchantAccountBalance = merchantAccountBalance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getProviderReferenceCode() {
        return providerReferenceCode;
    }

    public void setProviderReferenceCode(String providerReferenceCode) {
        this.providerReferenceCode = providerReferenceCode;
    }

    public String getOtherReferenceCode() {
        return otherReferenceCode;
    }

    public void setOtherReferenceCode(String otherReferenceCode) {
        this.otherReferenceCode = otherReferenceCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
