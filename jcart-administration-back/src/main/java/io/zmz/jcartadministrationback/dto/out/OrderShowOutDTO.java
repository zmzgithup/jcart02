package io.zmz.jcartadministrationback.dto.out;

import java.util.List;

public class OrderShowOutDTO {
    private Long orderId;
    private Integer customerId;
    private Byte status;
    private Double totalPrice;
    private Integer rewordPoints;
    private Long createTimetamp;
    private Long updateTimetamp;
    private Short shipMethod;
    private String shipAddress;
    private Double shipPrice;
    private Short payMethod;
    private String invoiceAddress;
    private Double invoicePrice;
    private String comment;
    private List<OrderProductShowOutDTO> orderProduct;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getRewordPoints() {
        return rewordPoints;
    }

    public void setRewordPoints(Integer rewordPoints) {
        this.rewordPoints = rewordPoints;
    }

    public Long getCreateTimetamp() {
        return createTimetamp;
    }

    public void setCreateTimetamp(Long createTimetamp) {
        this.createTimetamp = createTimetamp;
    }

    public Long getUpdateTimetamp() {
        return updateTimetamp;
    }

    public void setUpdateTimetamp(Long updateTimetamp) {
        this.updateTimetamp = updateTimetamp;
    }

    public Short getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(Short shipMethod) {
        this.shipMethod = shipMethod;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Double getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(Double shipPrice) {
        this.shipPrice = shipPrice;
    }

    public Short getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Short payMethod) {
        this.payMethod = payMethod;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public Double getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(Double invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<OrderProductShowOutDTO> getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(List<OrderProductShowOutDTO> orderProduct) {
        this.orderProduct = orderProduct;
    }
}
