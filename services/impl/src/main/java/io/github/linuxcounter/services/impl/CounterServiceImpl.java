package io.github.linuxcounter.services.impl;

import io.github.linuxcounter.common.value.AnonymousReportData;
import io.github.linuxcounter.repository.api.AnonymousReportDataRepository;
import io.github.linuxcounter.services.api.CounterService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;


@ApplicationScoped
public class CounterServiceImpl implements CounterService {

  @Inject
  AnonymousReportDataRepository anonymousReportDataRepository;

  @Override
  @Transactional
  public void countAnonymous(AnonymousReportData reportData) {
    anonymousReportDataRepository.countAnonymous(reportData);
  }
}
