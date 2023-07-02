
package com.ssm.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.ssm.entity.Token;
import com.ssm.utils.PageUtils;

import java.util.List;
import java.util.Map;


/**
 * token
 * @author yangliyuan
 * @date 2019年10月10日 上午9:18:20
 */
public interface TokenService extends IService<Token> {
 	PageUtils queryPage(Map<String, Object> params);
    
   	List<Token> selectListView(Wrapper<Token> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<Token> wrapper);
	
   	String generateToken(Long userid, String username, String tableName, String role);
   	
   	Token getTokenEntity(String token);
}
