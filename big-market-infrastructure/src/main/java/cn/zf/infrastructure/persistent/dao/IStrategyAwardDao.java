package cn.zf.infrastructure.persistent.dao;

import cn.zf.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zf
 * @Description: 抽奖策略奖品明细配置（概率、规则） Dao
 * @Create: 2024/6/8 15:49
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();

}
