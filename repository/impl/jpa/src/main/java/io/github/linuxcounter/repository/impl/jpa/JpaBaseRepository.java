package io.github.linuxcounter.repository.impl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaBaseRepository {

  @PersistenceContext(unitName = "unixcounter")
  private EntityManager entityManager;

  public JpaBaseRepository() {
  }

  public JpaBaseRepository(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  public EntityManager getEntityManager() {
    return entityManager;
  }

  public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
  }
}
