package cn.lesliu.Trading.dao;

import cn.lesliu.Trading.pojo.Goods;
import cn.lesliu.Trading.pojo.GoodsExample;
import cn.lesliu.Trading.pojo.GoodsKey;
import java.util.List;

import cn.lesliu.Trading.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(GoodsKey key);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(GoodsKey key);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List selectGoodsFeatureList();

    List selectGoodsNewestList();

    List selectGoodsPersonalList(User user);

    Goods selectGoodsDetail(GoodsKey goodsKey);

    String selectMaxGoodsID();

    int updateEnjoyNum(GoodsKey goodsKey);
}