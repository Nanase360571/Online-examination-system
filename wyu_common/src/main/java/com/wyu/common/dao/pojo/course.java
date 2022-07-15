package com.wyu.common.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @PackageName:com.wyu.common.dao.pojo
 * @ClassName:course
 * @Description:
 * @author:Aan
 * @data 2022/1/31 16:52
 **/
@Data
public class course {
    @TableId(value="id",type = IdType.AUTO)
    private Integer id;
    private String couSubject;
    private String couNumber;
    private Integer isTest;
}
