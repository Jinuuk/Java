package com.kh.hw;

public class ExistWordException extends RuntimeException{
  public ExistWordException() {
    super();
  }

  public ExistWordException(String message) {
    super(message);
  }

  public ExistWordException(String message, Throwable cause) {
    super(message, cause);
  }

  public ExistWordException(Throwable cause) {
    super(cause);
  }

  protected ExistWordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
