package io.github.linuxcounter.services.api;

import io.github.linuxcounter.common.value.AnonymousReportData;

/**
 * Service for incoming reports from clients.
 *
 * <p>This service will validate requests:</p>
 * <ul>
 *   <li>Check if anonymous data is correct and complete.</li>
 *   <li>Check if data of registered users matches their system id.</li>
 * </ul>
 */
public interface CounterService {

  /**
   * Counts an anonymous report.
   *
   * <p>This method will check if hwid is present and notify user if user is logged in and system_id was sent.</p>
   *
   * <p>The data will be saved to database (including a timestamp) if valid.</p>
   *
   * @param reportData the report data to check and (if valid) count.
   * @throws IllegalArgumentException any data validation error.
   */
  void countAnonymous(AnonymousReportData reportData);
}
