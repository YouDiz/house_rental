package com.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.entity.File;
import com.ssm.service.FileService;
import com.ssm.mapper.FileMapper;
import org.springframework.stereotype.Service;

/**
* @author ColinCheem
* @description 针对表【file】的数据库操作Service实现
* @createDate 2023-07-02 17:27:19
*/
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File>
implements FileService{

}
