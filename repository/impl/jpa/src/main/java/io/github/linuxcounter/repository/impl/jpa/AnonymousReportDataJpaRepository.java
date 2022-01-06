package io.github.linuxcounter.repository.impl.jpa;

import io.github.linuxcounter.common.value.AnonymousReportData;
import io.github.linuxcounter.repository.api.AnonymousReportDataRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

@ApplicationScoped
public class AnonymousReportDataJpaRepository extends JpaBaseRepository implements AnonymousReportDataRepository {

  @Override
  public void countAnonymous(AnonymousReportData reportData) {
    final EntityManager em = getEntityManager();
    throw new UnsupportedOperationException(
        "not yet implemented: [io.github.linuxcounter.repository.impl.jpa.AnonymousReportDataJpaRepository::countAnonymous].");
  }
}
