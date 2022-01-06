package io.github.linuxcounter.web.rest.v1.json;

import io.github.linuxcounter.common.value.AnonymousReportData;
import io.github.linuxcounter.common.value.HardwareId;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

public class AnonymousRecordAdapter implements JsonbAdapter<AnonymousReportData, JsonObject> {

  @Override
  public JsonObject adaptToJson(AnonymousReportData obj) throws Exception {
    return Json.createObjectBuilder()
        .add("kernel_name", obj.kernelName())
        .add("kernel_version", obj.kernelVersion())
        .add("distribution_name", obj.distributionName())
        .add("distribution_version", obj.distributionVersion())
        .add("timezone", obj.timezone())
        .add("hardware_id", obj.hardwareId().value())
        .build();
  }

  @Override
  public AnonymousReportData adaptFromJson(JsonObject obj) throws Exception {
    return new AnonymousReportData(
        obj.getString("kernel_name"),
        obj.getString("kernel_version"),
        obj.getString("distribution_name"),
        obj.getString("distribution_version"),
        obj.getString("timezone"),
        new HardwareId(obj.getString("hardware_id"))
    );
  }
}
