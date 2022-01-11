package com.gmail.kutilandrej.springboot.service;

import com.gmail.kutilandrej.springboot.entity.Human;
import java.util.List;

public interface HumanService {
  List<Human> getAllHumans();
  void saveHuman(Human human);
  Human getHuman(int id);
  void deleteHuman(int id);
}
