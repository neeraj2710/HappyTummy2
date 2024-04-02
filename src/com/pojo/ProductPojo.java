
package com.pojo;

import java.awt.Image;


public class ProductPojo {
    private String productId;
    private String companyId;
    private String productName;
    private double productPrice;
    private Image productImage;
    private String productImageType;

    @Override
    public String toString() {
        return "ProductPojo{" + "productId=" + productId + ", companyId=" + companyId + ", productName=" + productName + ", productPrice=" + productPrice + ", productImage=" + productImage + ", productImageType=" + productImageType + '}';
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public String getProductImageType() {
        return productImageType;
    }

    public void setProductImageType(String productImageType) {
        this.productImageType = productImageType;
    }

    public ProductPojo() {
    }
}
