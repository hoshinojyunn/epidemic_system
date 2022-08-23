package com.yiqing.epidemicsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yiqing.epidemiccommon.pojo.LeaveRegistration;
import com.yiqing.epidemicsystem.service.LeaveRegistrationService;
import com.yiqing.epidemicsystem.mapper.LeaveRegistrationMapper;
import org.springframework.stereotype.Service;

/**
* @author 47345
* @description 针对表【leave_registration】的数据库操作Service实现
* @createDate 2022-08-23 11:15:39
*/
@Service
public class LeaveRegistrationServiceImpl extends ServiceImpl<LeaveRegistrationMapper, LeaveRegistration>
    implements LeaveRegistrationService{

}




