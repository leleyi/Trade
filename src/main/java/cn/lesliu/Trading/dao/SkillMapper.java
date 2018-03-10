package cn.lesliu.Trading.dao;

import cn.lesliu.Trading.pojo.Skill;
import cn.lesliu.Trading.pojo.SkillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillMapper {
    int countByExample(SkillExample example);

    int deleteByExample(SkillExample example);

    int deleteByPrimaryKey(String id);

    int insert(Skill record);

    int insertSelective(Skill record);

    List<Skill> selectByExample(SkillExample example);

    Skill selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByExample(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByPrimaryKeySelective(Skill record);

    int updateByPrimaryKey(Skill record);
}