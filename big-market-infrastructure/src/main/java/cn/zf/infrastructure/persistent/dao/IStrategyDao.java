package cn.zf.infrastructure.persistent.dao;

import cn.zf.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zf
 * @Description: 抽奖策略 Dao
 * @Create: 2024/6/8 15:48
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

}
