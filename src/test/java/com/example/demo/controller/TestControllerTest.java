package com.example.demo.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class)
class TestControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TestService testService;

  @Test
  void getTestMessageReturnsServiceResponse() throws Exception {
    given(testService.getMessage()).willReturn("Service response");

    mockMvc.perform(get("/test"))
        .andExpect(status().isOk())
        .andExpect(content().string("Service response"));
  }
}
