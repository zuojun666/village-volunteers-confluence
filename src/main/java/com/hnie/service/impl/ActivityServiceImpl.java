package com.hnie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnie.entity.Activity;
import com.hnie.service.ActivityService;
import com.hnie.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【activity】的数据库操作Service实现
* @createDate 2022-05-13 17:09:16
*/
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements ActivityService{

}




