package com.boot.mycafe.cafe.Controller;

import com.boot.mycafe.cafe.Model.Canteen;
import com.boot.mycafe.cafe.Service.ServiceImpl.CanteenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/canteen")
public class CanteenController {
    @Autowired
    private CanteenServiceImpl canteenService;

    @RequestMapping("/detail/{canteen_id}")
    public Canteen getCanteenDetails(@PathVariable int canteen_id){
        return canteenService.getCanteenDetail(canteen_id);
    }


}
