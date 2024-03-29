package com.mvp.world.mybatisplusshardingdruid.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("`user`")
public class UserPo {
    @TableId(type = IdType.AUTO)
    Long id;
    String userName;
    String mobile;
    Integer age;
    Integer sex;
    String school;
    Integer type;
    String remark;
    LocalDateTime createdTime;
    LocalDateTime updatedTime;
}


