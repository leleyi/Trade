package cn.lesliu.Trading.dao;

import cn.lesliu.Trading.pojo.GoodsImg;
import cn.lesliu.Trading.pojo.GoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsImgMapper {
    int countByExample(GoodsImgExample example);

    int deleteByExample(GoodsImgExample example);

    int deleteByPrimaryKey(String imgid);

    int insert(GoodsImg record);

    int insertSelective(GoodsImg record);

    List<GoodsImg> selectByExample(GoodsImgExample example);

    GoodsImg selectByPrimaryKey(String imgid);

    int updateByExampleSelective(@Param("record") GoodsImg record, @Param("example") GoodsImgExample example);

    int updateByExample(@Param("record") GoodsImg record, @Param("example") GoodsImgExample example);

    int updateByPrimaryKeySelective(GoodsImg record);

    int updateByPrimaryKey(GoodsImg record);

    String selectMaxImgID();
}