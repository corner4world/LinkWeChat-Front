package com.linkwechat.wecom.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linkwechat.wecom.domain.WeCustomer;
import com.linkwechat.wecom.domain.WeUser;
import com.linkwechat.wecom.domain.vo.WeLeaveUserInfoAllocateVo;
import com.linkwechat.wecom.domain.vo.WeMakeCustomerTag;

import java.util.List;

/**
 * 企业微信客户Service接口
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public interface IWeCustomerService extends IService<WeCustomer>
{
    /**
     * 查询企业微信客户
     * 
     * @param externalUserId 企业微信客户ID
     * @return 企业微信客户
     */
    public WeCustomer selectWeCustomerById(String externalUserId);

    /**
     * 新增/修改企业微信客户
     *
     * @param weCustomer 企业微信客户
     * @return 修改结果
     */
    @Override
    public boolean saveOrUpdate(WeCustomer weCustomer);

    /**
     * 查询企业微信客户列表
     * 
     * @param weCustomer 企业微信客户
     * @return 企业微信客户集合
     */
    public List<WeCustomer> selectWeCustomerList(WeCustomer weCustomer);


    /**
     * 同步客户接口
     * @return
     */
    public void synchWeCustomer();


    /**
     * 分配离职员工客户
     * @param weLeaveUserInfoAllocateVo
     */
    public void allocateWeCustomer(WeLeaveUserInfoAllocateVo weLeaveUserInfoAllocateVo);


    /**
     * 客户打标签
     * @param weMakeCustomerTag
     */
    public void makeLabel(WeMakeCustomerTag weMakeCustomerTag);


    /**
     * 移除客户标签
     * @param weMakeCustomerTag
     */
    public void removeLabel(WeMakeCustomerTag weMakeCustomerTag);


    /**
     * 根据员工ID获取客户
     * @param externalUserid
     * @return
     */
    public List<WeUser> getCustomersByUserId(String externalUserid);

    /**
     * 获取客户详情并同步客户数据
     * @param externalUserid
     */
    public void getCustomersInfoAndSynchWeCustomer(String externalUserid);

    /**
     * 删除客户
     * @param externalUserid
     */
    public void deleteCustomersByEid(String externalUserid);

}
