package io.github.linuxcounter.common.value;

public record SystemId(String value) {

  private static final SystemId NO_VALUE = new SystemId("__NO_VALUE__");

  public SystemId(String value) {
    if (null == value || "".equals(value)) {
      this.value = NO_VALUE.value();
      return;
    }

    this.value = value;
  }
}
