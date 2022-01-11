package com.gmail.kutilandrej.springboot.service;

import com.gmail.kutilandrej.springboot.dao.HumanDao;
import com.gmail.kutilandrej.springboot.entity.Human;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImpl implements HumanService {

  @Autowired
  private HumanDao humanDao;

  @Override
  @Transactional
  public List<Human> getAllHumans() {
    return humanDao.getAllHumans();
  }

  @Override
  @Transactional
  public void saveHuman(Human human) {
    humanDao.saveHuman(human);
  }

  @Override
  @Transactional
  public Human getHuman(int id) {
    return humanDao.getHuman(id);
  }

  @Override
  @Transactional
  public void deleteHuman(int id) {
    humanDao.deleteHuman(id);
  }
}
