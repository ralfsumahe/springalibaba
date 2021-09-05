package com.example.userservice.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.userservice.member.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
@Mapper
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
}
