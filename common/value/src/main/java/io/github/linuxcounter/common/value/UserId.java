package io.github.linuxcounter.common.value;

public record UserId(String value) {

  private static final UserId NO_VALUE = new UserId("__NO_VALUE__");

  public UserId(String value) {
    if (null == value || "".equals(value)) {
      this.value = NO_VALUE.value;
      return;
    }

    this.value = value;
  }
}
