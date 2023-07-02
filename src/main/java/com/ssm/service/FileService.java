package com.ssm.service;

import com.ssm.entity.File;
import com.baomidou.mybatisplus.service.IService;

/**
* @author ColinCheem
* @description 针对表【file】的数据库操作Service
* @createDate 2023-07-02 17:27:19
*/
public interface FileService extends IService<File> {

    File selectByPrimaryKey(String rname);
}
