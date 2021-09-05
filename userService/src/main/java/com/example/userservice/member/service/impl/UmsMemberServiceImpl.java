package com.example.userservice.member.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.userservice.member.entity.UmsMember;
import com.example.userservice.member.mapper.UmsMemberMapper;
import com.example.userservice.member.service.IUmsMemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IUmsMemberService {

}
