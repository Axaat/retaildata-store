package com.sgglabs.retail.model;

import java.time.LocalDate;
import java.util.Objects;

/*
 * CREATE TABLE SellerProductData (
 *   Id BIGINT(20) NOT NULL AUTO_INCREMENT,
 *   ProdSearchResultId BIGINT(20) NOT NULL,
 *   SellerName VARCHAR(30),
 *   RatingIndex VARCHAR(30),
 *   TotalRatings VARCHAR(20),
 *   Details VARCHAR(50),
 *   BasePrice VARCHAR(50),
 *   TotalPrice VARCHAR(20),
 *   StatusId INT(2) NOT NULL DEFAULT 2,
 *   CreatedDate DATE,
 *   ModifiedDate DATE,
 *   PRIMARY KEY (Id),
 *   FOREIGN KEY (ProdSearchResultId) REFERENCES ProductSearchResult(Id)
 *   FOREIGN KEY (StatusId) REFERENCES Status(Id)
 *  );
 */
public class SellerProductData {
    private static final String TO_STRING_FORMAT =
            "SellerProductData[id=%s, prodSearchResultId=%s, sellerName='%s', ratingIndex='%s', totalRatings='%s', " +
                    "details='%s', basePrice='%s', totalPrice='%s', statusId=%s, createdDate=%s, modifiedDate=%s]";
    private int id;

    private String sellerName;

    private String ratingIndex;

    private String totalRatings;

    private String details;

    private String basePrice;

    private String totalPrice;

    private ProductSearchResult productSearchResult;

    private int statusId;

    private LocalDate createdDate;

    private LocalDate modifiedDate;

    public SellerProductData() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getRatingIndex() {
        return ratingIndex;
    }

    public void setRatingIndex(String ratingIndex) {
        this.ratingIndex = ratingIndex;
    }

    public String getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(String numberOfRatings) {
        this.totalRatings = numberOfRatings;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ProductSearchResult getProductSearchResult() {
        return productSearchResult;
    }

    public void setProductSearchResult(ProductSearchResult productSearchResult) {
        this.productSearchResult = productSearchResult;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerProductData that = (SellerProductData) o;
        return id == that.id &&
                statusId == that.statusId &&
                Objects.equals(sellerName, that.sellerName) &&
                Objects.equals(ratingIndex, that.ratingIndex) &&
                Objects.equals(totalRatings, that.totalRatings) &&
                Objects.equals(details, that.details) &&
                Objects.equals(basePrice, that.basePrice) &&
                Objects.equals(totalPrice, that.totalPrice) &&
                Objects.equals(productSearchResult, that.productSearchResult) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sellerName, ratingIndex, totalRatings, details,
                basePrice, totalPrice, productSearchResult, statusId, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_FORMAT, id, productSearchResult.getId(), sellerName, ratingIndex, totalRatings,
                details, basePrice, totalPrice, statusId, createdDate, modifiedDate);
    }
}