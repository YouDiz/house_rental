package com.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.entity.Contract;
import com.ssm.service.ContractService;
import com.ssm.mapper.ContractMapper;
import org.springframework.stereotype.Service;

/**
* @author ColinCheem
* @description 针对表【contract(出租订单)】的数据库操作Service实现
* @createDate 2023-07-02 17:27:14
*/
@Service
public class ContractServiceImpl extends ServiceImpl<ContractMapper, Contract>
implements ContractService{

}
