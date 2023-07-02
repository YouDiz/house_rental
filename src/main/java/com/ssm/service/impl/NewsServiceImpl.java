package com.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.entity.News;
import com.ssm.service.NewsService;
import com.ssm.mapper.NewsMapper;
import org.springframework.stereotype.Service;

/**
* @author ColinCheem
* @description 针对表【news(系统公告)】的数据库操作Service实现
* @createDate 2023-07-02 17:27:25
*/
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News>
implements NewsService{

}
