package com.yiqing.epidemicsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yiqing.epidemiccommon.pojo.Person;
import com.yiqing.epidemicsystem.service.PersonService;
import com.yiqing.epidemicsystem.mapper.PersonMapper;
import org.springframework.stereotype.Service;

/**
* @author 47345
* @description 针对表【person】的数据库操作Service实现
* @createDate 2022-08-23 11:15:39
*/
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person>
    implements PersonService{

}




