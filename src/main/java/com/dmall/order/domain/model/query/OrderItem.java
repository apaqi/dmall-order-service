package com.dmall.order.domain.model.query;

import com.dmall.order.domain.common.ValueObject;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "jx_order_item")
public class OrderItem implements ValueObject<OrderItem> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
//
//    private Long skuSnapshotId;
//    private double price;
//    private Integer amount;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ORDER_ID")
    private Order order;

    public OrderItem() {
    }

//    public OrderItem(Integer amount, double price, String skuId) {
//        this.amount = amount;
//    }
//
//    public Integer getAmount() {
//        return amount;
//    }

    @Override
    public boolean sameValueAs(OrderItem other) {
        return other.id.equals(id);
    }
}