package com.example.forum.DAO;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.forum.Entity.UserEntity;

@Dao
public interface UserDao {
    @Insert
    void registerUser(UserEntity userEntity);
}
