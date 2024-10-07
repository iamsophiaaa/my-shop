package com.dailycodework.my_shop.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private int id;
    private String name;

    private String brand;
    private int inventory;
    private Category category;
    private String description;
    private BigDecimal price;
    private List<Image> images;

}
