package com.linkwechat.wecom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linkwechat.wecom.domain.WeCustomerMessageOriginal;
import com.linkwechat.wecom.mapper.WeCustomerMessageOriginalMapper;
import com.linkwechat.wecom.service.IWeCustomerMessageOriginalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 群发消息 原始数据信息表 we_customer_messageOriginal
 *
 * @author kewen
 * @date 2020-12-12
 */
@Service
public class WeCustomerMessageOriginalServiceImpl extends  ServiceImpl<WeCustomerMessageOriginalMapper,WeCustomerMessageOriginal>implements IWeCustomerMessageOriginalService {

    @Autowired
    private WeCustomerMessageOriginalMapper weCustomerMessageOriginalMapper;

    @Override
    public int saveWeCustomerMessageOriginal(WeCustomerMessageOriginal weCustomerMessageOriginal) {
        return weCustomerMessageOriginalMapper.insert(weCustomerMessageOriginal);
    }


}