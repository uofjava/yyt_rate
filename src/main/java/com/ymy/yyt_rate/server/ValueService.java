package com.ymy.yyt_rate.server;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ymy.yyt_rate.dao.ValuesDao;
import com.ymy.yyt_rate.engite.Value;
import org.springframework.stereotype.Service;

@Service
public class ValueService extends ServiceImpl<ValuesDao, Value> implements IValueService {
}
