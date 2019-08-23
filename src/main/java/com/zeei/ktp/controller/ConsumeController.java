package com.zeei.ktp.controller;

import com.zeei.ktp.service.ConsumeService;
import com.zeei.ktp.vo.ApiResult;
import com.zeei.ktp.vo.Consume;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consume")
@Api(value = "contacts-api")
public class ConsumeController {

	@Autowired
	private ConsumeService consumeService;
	
	@RequestMapping(value = "{receiveNum}",method = RequestMethod.GET)
	@ApiOperation(value = "1", httpMethod = "GET", response = ApiResult.class, notes = "1")
	public ApiResult<Consume> findConsumeById(@PathVariable("receiveNum") String receiveNum) {
		ApiResult<Consume> result = new ApiResult<>();
		Consume consume = consumeService.findConsumeById(receiveNum);
		result.setData(consume);
		return result;
	}
}
