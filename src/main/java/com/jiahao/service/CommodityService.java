package com.jiahao.service;

import com.jiahao.pojo.Commodity;

import java.util.List;

/**
 * @author fangjiahao
 * @data 2019/2/14 15:40
 */
public interface CommodityService {
    List<Commodity> getCommodityList();

    String login(String name, String password);
}
