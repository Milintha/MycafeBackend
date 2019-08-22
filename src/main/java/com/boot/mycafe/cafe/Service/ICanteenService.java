package com.boot.mycafe.cafe.Service;

import com.boot.mycafe.cafe.Model.Canteen;

public interface ICanteenService {

    public Canteen getCanteenDetail(int canteen_id);
    public boolean addCanteen(Canteen canteen);
    public boolean addNotice(int canteen_id,String notice);
    public boolean updateOpenTime(String openTime);
    public boolean updateCloseTime(String closeTime);
    public boolean updateOpenCloseTime(String openTime,String closeTime);

}

