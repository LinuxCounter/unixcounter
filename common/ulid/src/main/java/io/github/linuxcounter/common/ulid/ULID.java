package io.github.linuxcounter.common.ulid;

import java.io.Serializable;
import java.util.Objects;

public class ULID implements Comparable<ULID>, Serializable {

  private static final ULIDImpl generator = new ULIDImpl();

  private final ULIDImpl.Value value;

  private ULID(byte[] ulidBytes) {
    this.value = ULIDImpl.fromBytes(ulidBytes);
  }

  private ULID(String ulidString) {
    this.value = ULIDImpl.parseULID(ulidString);
  }

  public ULID(long mostSigBits, long leastSigBits) {
    value = new ULIDImpl.Value(mostSigBits, leastSigBits);
  }

  public static ULID randomULID() {
    return new ULID(generator.nextULID());
  }

  public static ULID fromString(String ulidString) {
    return new ULID(ulidString);
  }

  /**
   * Returns the least significant 64 bits of this UUID's 128 bit value.
   *
   * @return The least significant 64 bits of this UUID's 128 bit value
   */
  public long getLeastSignificantBits() {
    return value.getLeastSignificantBits();
  }

  /**
   * Returns the most significant 64 bits of this UUID's 128 bit value.
   *
   * @return The most significant 64 bits of this UUID's 128 bit value
   */
  public long getMostSignificantBits() {
    return value.getMostSignificantBits();
  }

  public long timestamp() {
    return value.timestamp();
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }

    if (other == null || getClass() != other.getClass()) {
      return false;
    }

    ULID ulid = (ULID) other;

    return value.equals(ulid.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public String toString() {
    return value.toString();
  }

  @Override
  public int compareTo(ULID other) {
    return value.compareTo(other.value);
  }
}
