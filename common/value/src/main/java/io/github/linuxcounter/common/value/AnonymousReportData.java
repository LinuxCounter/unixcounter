package io.github.linuxcounter.common.value;

/**
 * Incoming report data, e.g. when a registered or anonymous user sends data.
 */
public record AnonymousReportData(
    String kernelName,
    String kernelVersion,
    String distributionName,
    String distributionVersion,
    String timezone,
    HardwareId hardwareId
) {

}
