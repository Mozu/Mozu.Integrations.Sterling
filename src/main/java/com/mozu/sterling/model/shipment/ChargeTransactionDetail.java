//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 12:28:23 PM CST 
//


package com.mozu.sterling.model.shipment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceCollectionDetails",
    "creditCardTransactions",
    "paymentMethod",
    "paymentTransactionErrorList",
    "transferToOrder",
    "transferFromOrder"
})
@XmlRootElement(name = "ChargeTransactionDetail")
public class ChargeTransactionDetail {

    @XmlAttribute(name = "AuditTransactionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String auditTransactionID;
    @XmlAttribute(name = "AuthorizationExpirationDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String authorizationExpirationDate;
    @XmlAttribute(name = "AuthorizationID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String authorizationID;
    @XmlAttribute(name = "BookAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bookAmount;
    @XmlAttribute(name = "CallForAuthorizationStatus")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String callForAuthorizationStatus;
    @XmlAttribute(name = "CashBackAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cashBackAmount;
    @XmlAttribute(name = "ChargeTransactionKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeTransactionKey;
    @XmlAttribute(name = "ChargeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeType;
    @XmlAttribute(name = "CollectionDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String collectionDate;
    @XmlAttribute(name = "CreditAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String creditAmount;
    @XmlAttribute(name = "DebitAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String debitAmount;
    @XmlAttribute(name = "DistributedAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String distributedAmount;
    @XmlAttribute(name = "ExecutionDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String executionDate;
    @XmlAttribute(name = "HoldAgainstBook")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String holdAgainstBook;
    @XmlAttribute(name = "InPerson")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inPerson;
    @XmlAttribute(name = "MappedProcessedAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mappedProcessedAmount;
    @XmlAttribute(name = "MappedRequestAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mappedRequestAmount;
    @XmlAttribute(name = "OfflineStatus")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String offlineStatus;
    @XmlAttribute(name = "OpenAuthorizedAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openAuthorizedAmount;
    @XmlAttribute(name = "OrderHeaderKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderHeaderKey;
    @XmlAttribute(name = "OrderInvoiceKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderInvoiceKey;
    @XmlAttribute(name = "PaymentEntryType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String paymentEntryType;
    @XmlAttribute(name = "PaymentKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String paymentKey;
    @XmlAttribute(name = "PostponedAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String postponedAmount;
    @XmlAttribute(name = "RequestAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String requestAmount;
    @XmlAttribute(name = "SettledAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String settledAmount;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "TransactionDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transactionDate;
    @XmlAttribute(name = "TransferFromOhKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transferFromOhKey;
    @XmlAttribute(name = "TransferToOhKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transferToOhKey;
    @XmlAttribute(name = "UserExitStatus")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userExitStatus;
    @XmlAttribute(name = "VoidTransaction")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String voidTransaction;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "InvoiceCollectionDetails")
    protected InvoiceCollectionDetails invoiceCollectionDetails;
    @XmlElement(name = "CreditCardTransactions")
    protected CreditCardTransactions creditCardTransactions;
    @XmlElement(name = "PaymentMethod")
    protected List<PaymentMethod> paymentMethod;
    @XmlElement(name = "PaymentTransactionErrorList")
    protected PaymentTransactionErrorList paymentTransactionErrorList;
    @XmlElement(name = "TransferToOrder")
    protected TransferToOrder transferToOrder;
    @XmlElement(name = "TransferFromOrder")
    protected TransferFromOrder transferFromOrder;

    /**
     * Gets the value of the auditTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditTransactionID() {
        return auditTransactionID;
    }

    /**
     * Sets the value of the auditTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditTransactionID(String value) {
        this.auditTransactionID = value;
    }

    /**
     * Gets the value of the authorizationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationExpirationDate() {
        return authorizationExpirationDate;
    }

    /**
     * Sets the value of the authorizationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationExpirationDate(String value) {
        this.authorizationExpirationDate = value;
    }

    /**
     * Gets the value of the authorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Sets the value of the authorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationID(String value) {
        this.authorizationID = value;
    }

    /**
     * Gets the value of the bookAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookAmount() {
        return bookAmount;
    }

    /**
     * Sets the value of the bookAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookAmount(String value) {
        this.bookAmount = value;
    }

    /**
     * Gets the value of the callForAuthorizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForAuthorizationStatus() {
        return callForAuthorizationStatus;
    }

    /**
     * Sets the value of the callForAuthorizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForAuthorizationStatus(String value) {
        this.callForAuthorizationStatus = value;
    }

    /**
     * Gets the value of the cashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the value of the cashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashBackAmount(String value) {
        this.cashBackAmount = value;
    }

    /**
     * Gets the value of the chargeTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTransactionKey() {
        return chargeTransactionKey;
    }

    /**
     * Sets the value of the chargeTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTransactionKey(String value) {
        this.chargeTransactionKey = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the collectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionDate() {
        return collectionDate;
    }

    /**
     * Sets the value of the collectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionDate(String value) {
        this.collectionDate = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAmount(String value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAmount() {
        return debitAmount;
    }

    /**
     * Sets the value of the debitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAmount(String value) {
        this.debitAmount = value;
    }

    /**
     * Gets the value of the distributedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributedAmount() {
        return distributedAmount;
    }

    /**
     * Sets the value of the distributedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributedAmount(String value) {
        this.distributedAmount = value;
    }

    /**
     * Gets the value of the executionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionDate() {
        return executionDate;
    }

    /**
     * Sets the value of the executionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionDate(String value) {
        this.executionDate = value;
    }

    /**
     * Gets the value of the holdAgainstBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldAgainstBook() {
        return holdAgainstBook;
    }

    /**
     * Sets the value of the holdAgainstBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldAgainstBook(String value) {
        this.holdAgainstBook = value;
    }

    /**
     * Gets the value of the inPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPerson() {
        return inPerson;
    }

    /**
     * Sets the value of the inPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPerson(String value) {
        this.inPerson = value;
    }

    /**
     * Gets the value of the mappedProcessedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedProcessedAmount() {
        return mappedProcessedAmount;
    }

    /**
     * Sets the value of the mappedProcessedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedProcessedAmount(String value) {
        this.mappedProcessedAmount = value;
    }

    /**
     * Gets the value of the mappedRequestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedRequestAmount() {
        return mappedRequestAmount;
    }

    /**
     * Sets the value of the mappedRequestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedRequestAmount(String value) {
        this.mappedRequestAmount = value;
    }

    /**
     * Gets the value of the offlineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineStatus() {
        return offlineStatus;
    }

    /**
     * Sets the value of the offlineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineStatus(String value) {
        this.offlineStatus = value;
    }

    /**
     * Gets the value of the openAuthorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAuthorizedAmount() {
        return openAuthorizedAmount;
    }

    /**
     * Sets the value of the openAuthorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAuthorizedAmount(String value) {
        this.openAuthorizedAmount = value;
    }

    /**
     * Gets the value of the orderHeaderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderKey() {
        return orderHeaderKey;
    }

    /**
     * Sets the value of the orderHeaderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderKey(String value) {
        this.orderHeaderKey = value;
    }

    /**
     * Gets the value of the orderInvoiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInvoiceKey() {
        return orderInvoiceKey;
    }

    /**
     * Sets the value of the orderInvoiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInvoiceKey(String value) {
        this.orderInvoiceKey = value;
    }

    /**
     * Gets the value of the paymentEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentEntryType() {
        return paymentEntryType;
    }

    /**
     * Sets the value of the paymentEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentEntryType(String value) {
        this.paymentEntryType = value;
    }

    /**
     * Gets the value of the paymentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentKey() {
        return paymentKey;
    }

    /**
     * Sets the value of the paymentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentKey(String value) {
        this.paymentKey = value;
    }

    /**
     * Gets the value of the postponedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostponedAmount() {
        return postponedAmount;
    }

    /**
     * Sets the value of the postponedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostponedAmount(String value) {
        this.postponedAmount = value;
    }

    /**
     * Gets the value of the requestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAmount() {
        return requestAmount;
    }

    /**
     * Sets the value of the requestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAmount(String value) {
        this.requestAmount = value;
    }

    /**
     * Gets the value of the settledAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettledAmount() {
        return settledAmount;
    }

    /**
     * Sets the value of the settledAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettledAmount(String value) {
        this.settledAmount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transferFromOhKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFromOhKey() {
        return transferFromOhKey;
    }

    /**
     * Sets the value of the transferFromOhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFromOhKey(String value) {
        this.transferFromOhKey = value;
    }

    /**
     * Gets the value of the transferToOhKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToOhKey() {
        return transferToOhKey;
    }

    /**
     * Sets the value of the transferToOhKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToOhKey(String value) {
        this.transferToOhKey = value;
    }

    /**
     * Gets the value of the userExitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserExitStatus() {
        return userExitStatus;
    }

    /**
     * Sets the value of the userExitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserExitStatus(String value) {
        this.userExitStatus = value;
    }

    /**
     * Gets the value of the voidTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidTransaction() {
        return voidTransaction;
    }

    /**
     * Sets the value of the voidTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidTransaction(String value) {
        this.voidTransaction = value;
    }

    /**
     * Gets the value of the aDtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aDtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADtype() {
        if (aDtype == null) {
            aDtype = new ArrayList<String>();
        }
        return this.aDtype;
    }

    /**
     * Gets the value of the invoiceCollectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCollectionDetails }
     *     
     */
    public InvoiceCollectionDetails getInvoiceCollectionDetails() {
        return invoiceCollectionDetails;
    }

    /**
     * Sets the value of the invoiceCollectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCollectionDetails }
     *     
     */
    public void setInvoiceCollectionDetails(InvoiceCollectionDetails value) {
        this.invoiceCollectionDetails = value;
    }

    /**
     * Gets the value of the creditCardTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTransactions }
     *     
     */
    public CreditCardTransactions getCreditCardTransactions() {
        return creditCardTransactions;
    }

    /**
     * Sets the value of the creditCardTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTransactions }
     *     
     */
    public void setCreditCardTransactions(CreditCardTransactions value) {
        this.creditCardTransactions = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethod }
     * 
     * 
     */
    public List<PaymentMethod> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<PaymentMethod>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the paymentTransactionErrorList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionErrorList }
     *     
     */
    public PaymentTransactionErrorList getPaymentTransactionErrorList() {
        return paymentTransactionErrorList;
    }

    /**
     * Sets the value of the paymentTransactionErrorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionErrorList }
     *     
     */
    public void setPaymentTransactionErrorList(PaymentTransactionErrorList value) {
        this.paymentTransactionErrorList = value;
    }

    /**
     * Gets the value of the transferToOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TransferToOrder }
     *     
     */
    public TransferToOrder getTransferToOrder() {
        return transferToOrder;
    }

    /**
     * Sets the value of the transferToOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferToOrder }
     *     
     */
    public void setTransferToOrder(TransferToOrder value) {
        this.transferToOrder = value;
    }

    /**
     * Gets the value of the transferFromOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TransferFromOrder }
     *     
     */
    public TransferFromOrder getTransferFromOrder() {
        return transferFromOrder;
    }

    /**
     * Sets the value of the transferFromOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferFromOrder }
     *     
     */
    public void setTransferFromOrder(TransferFromOrder value) {
        this.transferFromOrder = value;
    }

}