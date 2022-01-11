package com.gmail.kutilandrej.springboot.dao;


import com.gmail.kutilandrej.springboot.entity.Human;
import java.util.List;

public interface HumanDao {

  List<Human> getAllHumans();

  void saveHuman(Human human);

  Human getHuman(int id);

  void deleteHuman(int id);
}
