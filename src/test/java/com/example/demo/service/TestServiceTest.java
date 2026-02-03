package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TestServiceTest {
  @Test
  void getMessageReturnsExpectedMessage() {
    TestService service = new TestService();

    assertThat(service.getMessage()).isEqualTo("Hello from testService");
  }
}
