package cn.zf.infrastructure.persistent.dao;

import cn.zf.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zf
 * @Description: 策略规则 Dao
 * @Create: 2024/6/8 15:50
 */
@Mapper
public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();

}
