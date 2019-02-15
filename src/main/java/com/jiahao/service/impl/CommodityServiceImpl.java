package com.jiahao.service.impl;

import com.jiahao.pojo.Commodity;
import com.jiahao.repository.mapper.CommodityMapper;
import com.jiahao.repository.mapper.UserMapper;
import com.jiahao.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangjiahao
 * @data 2019/2/14 15:40
 */
@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Commodity> getCommodityList() {
        List<Commodity> commodityList = commodityMapper.selectAll();
        return commodityList;
    }

    @Override
    public String login(String name, String password) {
        String userName = userMapper.login(name,password);
        return userName;
    }
}
