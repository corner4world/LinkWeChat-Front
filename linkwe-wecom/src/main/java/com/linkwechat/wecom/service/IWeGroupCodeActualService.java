package com.linkwechat.wecom.service;

import java.util.List;
import com.linkwechat.wecom.domain.WeGroupCodeActual;

/**
 * 实际群码Service接口
 * 
 * @author ruoyi
 * @date 2020-10-07
 */
public interface IWeGroupCodeActualService 
{
    /**
     * 查询实际群码
     * 
     * @param id 实际群码ID
     * @return 实际群码
     */
    public WeGroupCodeActual selectWeGroupCodeActualById(Long id);

    /**
     * 查询实际群码列表
     * 
     * @param weGroupCodeActual 实际群码
     * @return 实际群码集合
     */
    public List<WeGroupCodeActual> selectWeGroupCodeActualList(WeGroupCodeActual weGroupCodeActual);

    /**
     * 新增实际群码
     * 
     * @param weGroupCodeActual 实际群码
     * @return 结果
     */
    public int insertWeGroupCodeActual(WeGroupCodeActual weGroupCodeActual);

    /**
     * 修改实际群码
     * 
     * @param weGroupCodeActual 实际群码
     * @return 结果
     */
    public int updateWeGroupCodeActual(WeGroupCodeActual weGroupCodeActual);

    /**
     * 批量删除实际群码
     * 
     * @param ids 需要删除的实际群码ID
     * @return 结果
     */
    public int deleteWeGroupCodeActualByIds(Long[] ids);

    /**
     * 删除实际群码信息
     * 
     * @param id 实际群码ID
     * @return 结果
     */
    public int deleteWeGroupCodeActualById(Long id);
}
