package com.ymy.yyt_rate.server;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ymy.yyt_rate.dao.RateDao;
import com.ymy.yyt_rate.engite.Rate;
import org.springframework.stereotype.Service;

@Service
public class RateService extends ServiceImpl<RateDao, Rate> implements IRateService{
}
