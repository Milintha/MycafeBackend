package com.boot.mycafe.cafe.Service;

import com.boot.mycafe.cafe.Model.Food;

import java.util.List;

public interface IFoodService {
    List<Food> getFoodsById(int id);
}
