package cn.lesliu.Trading.service;

import cn.lesliu.Trading.pojo.Skill;

import java.util.List;

interface SkillService {

    List<Skill> selectUserDetail() throws Exception;

    int addSkill(Skill Skill) throws Exception;

    int removeSkill(Skill Skill) throws Exception;

    int updateSkill(Skill Skill) throws Exception;

    int getSkillById(Skill Skill)throws Exception;
}
