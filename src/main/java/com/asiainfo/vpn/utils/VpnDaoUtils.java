package com.asiainfo.vpn.utils;

import com.asiainfo.vpn.bean.Organization;
import com.asiainfo.vpn.bean.OrganizationExample;
import com.asiainfo.vpn.bean.SequenceValueItem;
import com.asiainfo.vpn.bean.SequenceValueItemExample;
import com.asiainfo.vpn.mapper.OrganizationMapper;
import com.asiainfo.vpn.mapper.SequenceValueItemMapper;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * 定义services层常用到的小方法,比如部门id和部门名字之间的转换...
 */
public class VpnDaoUtils {

    private static SequenceValueItemMapper seqMapper;
    private static OrganizationMapper orgMapper;

    /**
     * 根据名字拿到主键
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public static String getID(String name) throws SQLException {
        SequenceValueItemExample example = new SequenceValueItemExample();
        SequenceValueItemExample.Criteria criteria = example.createCriteria();
        criteria.andSeqNameEqualTo(name);
        List<SequenceValueItem> list = seqMapper.selectByExample(example);
        if (list.size() == 0) {
            throw new SQLException("根据名字找不到主键!!!");
        }
        return list.get(0).getSeqId() + "";
    }

    /**
     * 根据名字更新主键表
     *
     * @param name
     * @throws SQLException
     */
    public static void updateID(String name) throws SQLException {
        // 先取出来
        SequenceValueItemExample example = new SequenceValueItemExample();
        SequenceValueItemExample.Criteria criteria = example.createCriteria();
        criteria.andSeqNameEqualTo(name);
        List<SequenceValueItem> list = seqMapper.selectByExample(example);
        if (list.size() == 0) {
            throw new SQLException("根据名字找不到主键!!!");
        }

        SequenceValueItem ite = new SequenceValueItem();
        ite.setSeqId(list.get(0).getSeqId() + 1);
        Date date = new Date();
        ite.setLastUpdatedStamp(date);
        ite.setLastUpdatedTxStamp(date);
        seqMapper.updateByExampleSelective(ite, new SequenceValueItemExample());
    }

    /**
     * 将部门名字转换成部门ID
     *
     * @param name
     * @return
     */
    public static String getDepartmentID(String name) throws SQLException {
        OrganizationExample example = new OrganizationExample();
        OrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<Organization> organizations = orgMapper.selectByExample(example);
        if (organizations.size() == 0) {
            throw new SQLException("部门不存在!!!");
        }
        return organizations.get(0).getId();
    }


}
