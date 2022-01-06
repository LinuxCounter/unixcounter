package io.github.linuxcounter.repository.impl.jpa;

import io.github.linuxcounter.common.value.AnonymousReportData;
import io.github.linuxcounter.repository.api.AnonymousReportDataRepository;
import io.github.linuxcounter.repository.impl.jpa.mapper.AnonymousReportDataMapper;
import io.github.linuxcounter.repository.impl.jpa.pdo.AnonymousReportDataPdo;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

@ApplicationScoped
public class AnonymousReportDataJpaRepository extends JpaBaseRepository implements AnonymousReportDataRepository {

  @Override
  public void countAnonymous(AnonymousReportData reportData) {
    AnonymousReportDataPdo reportPdo = AnonymousReportDataMapper.toPdo(reportData);
    final EntityManager em = getEntityManager();
    em.persist(reportPdo);
    throw new UnsupportedOperationException(
        "not yet implemented: [io.github.linuxcounter.repository.impl.jpa.AnonymousReportDataJpaRepository::countAnonymous].");
  }
}
