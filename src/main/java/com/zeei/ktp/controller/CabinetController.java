package com.zeei.ktp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zeei.ktp.service.CabinetService;
import com.zeei.ktp.vo.ApiResult;
import com.zeei.ktp.vo.Cabinet;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("cabinet")
@Api(value = "contacts-api")
public class CabinetController {

	@Autowired
	private CabinetService cabinetService;

	@RequestMapping(value = "{cabinetId}", method = RequestMethod.GET)
	@ApiOperation(value = "1", httpMethod = "GET", response = ApiResult.class, notes = "1")
	public ApiResult<Cabinet> findCabinetById(@PathVariable("cabinetId") Integer cabinetId) {
		ApiResult<Cabinet> result = new ApiResult<>();
		result.setData(cabinetService.findCabinetById(cabinetId));
		return result;
	}
}
