package com.kh.hw;

public class NonExistWordException extends RuntimeException {
  public NonExistWordException() {
    super();
  }

  public NonExistWordException(String message) {
    super(message);
  }

  public NonExistWordException(String message, Throwable cause) {
    super(message, cause);
  }

  public NonExistWordException(Throwable cause) {
    super(cause);
  }

  protected NonExistWordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
