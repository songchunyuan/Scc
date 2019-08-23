package com.zeei.ktp.service.impl;

import com.zeei.common.utils.DateUtil;
import com.zeei.ktp.dao.ConsumeDao;
import com.zeei.ktp.service.ConsumeService;
import com.zeei.ktp.vo.BufferBoxIssueVO;
import com.zeei.ktp.vo.Consume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumeServiceImpl implements ConsumeService {

	@Autowired
	private ConsumeDao consumeDao;


    @Override
    public String sendConsume() {
        //1. 获取领用表未发送数据
        Consume consume = new Consume();
        //查询条件
        consume.setIsSend(0);

        List<Consume> consumeList = consumeDao.select(consume);

        //组装BufferBoxIssueVO
        List<BufferBoxIssueVO> boxIssueVOList = this.assembleBufferBoxIssueVo(consumeList);

        //请求第三方接口开始同步
        boxIssueVOList.stream().map(boxIssueVo -> {
            //TODO 请求接口
            return "";
        });
        return null;
    }

    @Override
    public Consume findConsumeById(String receiveNum) {
        return consumeDao.selectByPrimaryKey(receiveNum);
    }

    /**
     * 组装BufferBoxIssueVO
     * @param consumeList 领用表数据集合
     * @return
     */
    private List<BufferBoxIssueVO> assembleBufferBoxIssueVo(List<Consume> consumeList) {
        List<BufferBoxIssueVO> boxIssueVOList = new ArrayList<>();
        for (Consume consume : consumeList) {
            BufferBoxIssueVO bufferBoxIssueVO = new BufferBoxIssueVO();
            bufferBoxIssueVO.setBillId(consume.getReceiveNum());
            //TODO 通过userId获取userCode
            bufferBoxIssueVO.setCreatorId("");
            bufferBoxIssueVO.setProjectId(consume.getProjectId());
            bufferBoxIssueVO.setPlanIssueDate(
                    DateUtil.convertDateToString(consume.getConsumeTime(), DateUtil.DATE_FORMAT));
            bufferBoxIssueVO.setDataArea(consume.getDataArea());
            //TODO 通过consumeId获取所有的条码信息
            bufferBoxIssueVO.setSubItem(null);
        }
        return boxIssueVOList;
    }
}
