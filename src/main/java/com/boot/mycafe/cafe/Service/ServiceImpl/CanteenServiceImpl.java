package com.boot.mycafe.cafe.Service.ServiceImpl;

import com.boot.mycafe.cafe.Model.Canteen;
import com.boot.mycafe.cafe.Repository.CanteenRepository;
import com.boot.mycafe.cafe.Service.ICanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CanteenServiceImpl implements ICanteenService {
    @Autowired
    private CanteenRepository canteenRepository;

    @Override
    public Canteen getCanteenDetail(int canteen_id) {
        return canteenRepository.getOne(canteen_id);
    }

    @Override
    public boolean addCanteen(Canteen canteen) {
        int isUpdate = canteenRepository.insertCanteen(canteen.getAuth_user_id(), canteen.getName(), canteen.getOpen(), canteen.getClose(), canteen.getNotice());
        if(isUpdate>0) {
            return true;
        }else{

            return false;
        }
    }

    @Override
    public boolean addNotice(int canteen_id, String notice) {
        return false;
    }

    @Override
    public boolean updateOpenTime(String openTime) {
        return false;
    }

    @Override
    public boolean updateCloseTime(String closeTime) {
        return false;
    }

    @Override
    public boolean updateOpenCloseTime(String openTime, String closeTime) {
        return false;
    }
}
