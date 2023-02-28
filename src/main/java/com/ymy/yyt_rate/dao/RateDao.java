package com.ymy.yyt_rate.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ymy.yyt_rate.engite.Rate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RateDao extends BaseMapper<Rate> {
}
