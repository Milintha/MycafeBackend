package com.boot.mycafe.cafe.Repository;

import com.boot.mycafe.cafe.Model.Canteen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Time;

public interface CanteenRepository extends JpaRepository<Canteen,Integer> {

    @Modifying
    @Query(value="insert into canteen (auth_user_id,name,open,close,notice) values(:auth_user_id,:name,:open,:close,:notice)",nativeQuery = true)
    int insertCanteen(@Param("auth_user_id")Integer auth_user_id, @Param("name")String name, @Param("open") String time, @Param("close") String close, @Param("notice")String notice);
}
