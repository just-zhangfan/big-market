package cn.zf.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
/**
 * @Author: zf
 * @Description: 抽奖策略
 * @Create: 2024/6/8 10:29
 */
@Data
// Data自动生成get、set方法
public class Strategy {

    /* 自增ID */
    private Long id;

    /* 抽奖策略ID */
    private Long strategyId;

    /* 抽奖策略描述 */
    private String strategyDesc;

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;

}
