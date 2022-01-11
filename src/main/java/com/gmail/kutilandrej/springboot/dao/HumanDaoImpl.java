package com.gmail.kutilandrej.springboot.dao;

import com.gmail.kutilandrej.springboot.entity.Human;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HumanDaoImpl implements HumanDao {

  @Autowired
  private EntityManager entityManager;

//  hibernate
//  @Autowired
//  private SessionFactory sessionFactory;

  @Override
  public List<Human> getAllHumans() {
    return entityManager.createQuery("from Human", Human.class).getResultList();
//    jpa session for hibernate
//    Session session = entityManager.unwrap(Session.class);
//    return session.createQuery("from Human", Human.class).getResultList();
  }

  @Override
  public void saveHuman(Human human) {
    Human newHuman = entityManager.merge(human);
    human.setId(newHuman.getId());
//    jpa session for hibernate
//    Session session = entityManager.unwrap(Session.class);
//    session.saveOrUpdate(human);
  }

  @Override
  public Human getHuman(int id) {
    return entityManager.find(Human.class, id);
//    jpa session for hibernate
//    Session session = entityManager.unwrap(Session.class);
//    return session.get(Human.class, id);
  }

  @Override
  public void deleteHuman(int id) {
    Query query = entityManager.createQuery("delete from Human as h where h.id=:id");
    query.setParameter("id", id);
    query.executeUpdate();
//    jpa session for hibernate
//    Session session = entityManager.unwrap(Session.class);
//    Query query = session.createQuery("delete from Human as h where h.id=:id");
//    query.setParameter("id", id);
//    query.executeUpdate();
  }
}
