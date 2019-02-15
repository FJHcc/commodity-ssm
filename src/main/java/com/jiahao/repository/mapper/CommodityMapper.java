package com.jiahao.repository.mapper;

import com.jiahao.pojo.Commodity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fangjiahao
 * @data 2019/2/14 16:40
 */
@Repository
public interface CommodityMapper {
    List<Commodity> selectAll();
}
