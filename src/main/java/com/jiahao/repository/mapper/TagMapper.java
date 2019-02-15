package com.jiahao.repository.mapper;

import com.jiahao.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fangjiahao
 * @data 2019/2/14 15:28
 */
@Repository
public interface TagMapper {
    List<Tag> selectTags();
}
