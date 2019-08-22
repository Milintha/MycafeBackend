package com.boot.mycafe.cafe.Repository;

import com.boot.mycafe.cafe.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {

    @Query(value = "select * from food where auth_user_id=?1",nativeQuery = true)
    List<Food> findByAuth_user_id(int auth_user_id);

}
