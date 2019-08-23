package com.zeei.ktp.service;


import com.zeei.ktp.vo.Consume;

public interface ConsumeService {
    /**
     * 向第三方发送领用信息
     * @return 返回发送成功的领用单号
     */
    String sendConsume();

    Consume findConsumeById(String receiveNum);
}
