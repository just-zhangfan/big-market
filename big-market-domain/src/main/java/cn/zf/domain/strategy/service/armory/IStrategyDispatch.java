package cn.zf.domain.strategy.service.armory;

/**
 * @Author: zf
 * @Description: 策略抽奖调度
 * @Create: 2024/6/11 10:49
 */
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

}
