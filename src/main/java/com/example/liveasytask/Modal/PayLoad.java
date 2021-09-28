package com.example.liveasytask.Modal;




import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PayLoad implements Serializable {
    @Id
    public String shipperId ;
    public String loadingPoint;
    public String unLoadingPoint;
    public String productType;
    public String truckType;
    public String noOfTrucks;
    public String weight;
    public String date;

    public PayLoad(
                   String shipperId,
                   String loadingPoint,
                   String unLoadingPoint,
                   String productType,
                   String truckType,
                   String noOfTrucks,
                   String weight,
                   String date)
    {
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unLoadingPoint = unLoadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.date = date;
    }

    public PayLoad() {

    }



    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnLoadingPoint() {
        return unLoadingPoint;
    }

    public void setUnLoadingPoint(String unLoadingPoint) {
        this.unLoadingPoint = unLoadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(String noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PayLoad{" +
                "shipperId='" + shipperId + '\'' +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unLoadingPoint='" + unLoadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks='" + noOfTrucks + '\'' +
                ", weight='" + weight + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
