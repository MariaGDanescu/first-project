package com.buyIT.web.model;

import java.util.Date;
/**
 * 
 * @author MariaDanescu
 *
 */
public class TodoShopping {
    private int id;
    private String user;
    private String desc;
    private Date orderDate;
    private boolean isReceived;

    public TodoShopping(int id, String user, String desc, Date targetDate,
            boolean isReceived) {
        super();
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.orderDate = targetDate;
        this.isReceived = isReceived;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setTargetDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public void setReceived(boolean isReceived) {
        this.isReceived = isReceived;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TodoShopping other = (TodoShopping) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, orderDate=%s, isReceived=%s",desc, orderDate, isReceived);
    }

}