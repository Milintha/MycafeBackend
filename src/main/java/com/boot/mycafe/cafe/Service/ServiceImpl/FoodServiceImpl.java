package com.boot.mycafe.cafe.Service.ServiceImpl;

import com.boot.mycafe.cafe.Model.Food;
import com.boot.mycafe.cafe.Repository.FoodRepository;
import com.boot.mycafe.cafe.Service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> getFoodsById(int id) {
        return foodRepository.findByOwner_id(id);
    }


}
