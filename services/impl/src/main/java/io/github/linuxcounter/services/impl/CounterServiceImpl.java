package io.github.linuxcounter.services.impl;

import io.github.linuxcounter.common.value.AnonymousReportData;
import io.github.linuxcounter.services.api.CounterService;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CounterServiceImpl implements CounterService {

  @Override
  public void countAnonymous(AnonymousReportData reportData) {
    // TODO: implement
    throw new UnsupportedOperationException(
        "not yet implemented: [io.github.linuxcounter.services.impl.CounterServiceImpl::countAnonymous].");
  }
}
