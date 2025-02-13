package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

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
   * 接收微信服务器的响应，测试添加get请求
   * @return API response json
   */
  @GetMapping(value = "/api/response")
  ApiResponse get(@RequestParam Map<String,Object> request) {
    JSONObject jsonObject=new JSONObject(request);
    logger.info("/api/response get request: "+jsonObject);

    return ApiResponse.ok(jsonObject.toString());
  }


  /**
   * 接收微信服务器的响应
   * @param request {@link Map}
   * @return API response json
   */
  @PostMapping(value = "/api/response")
  ApiResponse create(@RequestBody Map<String,Object> request) {
    JSONObject jsonObject=new JSONObject(request);
    logger.info("/api/response post request: {}", jsonObject);

    return ApiResponse.ok(jsonObject.toString());
  }
  
}