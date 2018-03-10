package cn.lesliu.Trading.dao;

import cn.lesliu.Trading.pojo.EmailMessages;
import cn.lesliu.Trading.pojo.EmailMessagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailMessagesMapper {
    int countByExample(EmailMessagesExample example);

    int deleteByExample(EmailMessagesExample example);

    int deleteByPrimaryKey(String messageid);

    int insert(EmailMessages record);

    int insertSelective(EmailMessages record);

    List<EmailMessages> selectByExample(EmailMessagesExample example);

    EmailMessages selectByPrimaryKey(String messageid);

    int updateByExampleSelective(@Param("record") EmailMessages record, @Param("example") EmailMessagesExample example);

    int updateByExample(@Param("record") EmailMessages record, @Param("example") EmailMessagesExample example);

    int updateByPrimaryKeySelective(EmailMessages record);

    int updateByPrimaryKey(EmailMessages record);
}