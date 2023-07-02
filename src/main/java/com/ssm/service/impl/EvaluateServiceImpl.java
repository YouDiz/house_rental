package com.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.entity.Evaluate;
import com.ssm.service.EvaluateService;
import com.ssm.mapper.EvaluateMapper;
import org.springframework.stereotype.Service;

/**
* @author ColinCheem
* @description 针对表【evaluate(在线客服)】的数据库操作Service实现
* @createDate 2023-07-02 17:27:17
*/
@Service
public class EvaluateServiceImpl extends ServiceImpl<EvaluateMapper, Evaluate>
implements EvaluateService{

}
