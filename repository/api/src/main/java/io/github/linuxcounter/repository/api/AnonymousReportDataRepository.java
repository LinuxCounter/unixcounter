package io.github.linuxcounter.repository.api;

import io.github.linuxcounter.common.value.AnonymousReportData;

public interface AnonymousReportDataRepository {

  void countAnonymous(AnonymousReportData reportData);
}
