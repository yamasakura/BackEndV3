package com.lhs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhs.entity.StageResult;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface StageResultMapper extends BaseMapper<StageResult> {
    @Update("truncate table stage_result")
    void deleteTableTemp();
}
