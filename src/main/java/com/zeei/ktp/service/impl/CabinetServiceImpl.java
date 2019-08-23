package com.zeei.ktp.service.impl;

import com.zeei.ktp.dao.CabinetDao;
import com.zeei.ktp.service.CabinetService;
import com.zeei.ktp.vo.Cabinet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabinetServiceImpl implements CabinetService {

	@Autowired
	private CabinetDao cabinetDao;
	@Override
	public Cabinet findCabinetById(Integer id) {
		return cabinetDao.selectByPrimaryKey(id);
	}

}
