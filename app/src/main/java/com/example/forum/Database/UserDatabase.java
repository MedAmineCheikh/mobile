package com.example.forum.Database;

import androidx.room.Database;

import com.example.forum.Entity.UserEntity;

@Database(entities = {UserEntity.class},version = 1)
public class UserDatabase {

}
