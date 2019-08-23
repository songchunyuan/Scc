package com.zeei.ktp.task;

import com.zeei.common.utils.DateUtil;

import java.util.Date;

/**
 * Created by Administrator on 2019/8/21.
 */
public class SendConsumeTask {

    public void send() {
        System.out.println(DateUtil.dateToDateString(new Date(), DateUtil.FULL_TIME_FORMAT));
    }
}
