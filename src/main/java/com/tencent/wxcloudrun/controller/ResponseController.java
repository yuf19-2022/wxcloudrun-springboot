package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

/**
 * counter控制器
 */
@RestController

public class ResponseController {

  final Logger logger;

  public ResponseController() {
    this.logger = LoggerFactory.getLogger(ResponseController.class);
  }


  /**
   * 接收微信服务器的响应
   * @param request {@link Map}
   * @return API response json
   */
  @PostMapping(value = "/api/response")
  ApiResponse create(@RequestBody Map<String,Object> request) {
    logger.info("/api/response post request: {}", new JSONObject(request));

    return ApiResponse.ok(0);
  }
  
}