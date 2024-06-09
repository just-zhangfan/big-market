package cn.zf.infrastructure.persistent.dao;

import cn.zf.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zf
 * @Description: 奖品表 DAO
 * @Create: 2024/6/8 11:03
 */
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();

}
