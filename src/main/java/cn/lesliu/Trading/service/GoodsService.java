package cn.lesliu.Trading.service;

import cn.lesliu.Trading.pojo.Goods;
import cn.lesliu.Trading.pojo.GoodsImg;
import cn.lesliu.Trading.pojo.GoodsKey;
import cn.lesliu.Trading.pojo.User;

import java.util.List;

public interface GoodsService {

    /**
     * 获取精选列表
     * @return 返回精选列表
     * @throws Exception
     */
    List<Goods> selectGoodsFeatureList()throws Exception;

    /**
     * 获取最新列表
     * @return 返回最新好货
     * @throws Exception
     */
    List<Goods> selectGoodsNewestList()throws Exception;

    /**
     * 获取图片滚动物品
     * @return
     * @throws Exception
     */
    List<Goods> selectGoodsAdvList()throws Exception;

    /**
     * 根据用户名id称获取相应商品
     * @return
     * @throws Exception
     */
    List<Goods> selectGoodsPersonalList(User user) throws Exception;

    /**
     * 获取商品信息不带图片
     * @param user
     * @return
     * @throws Exception
     */
    List<Goods> selectGoodsOwnerList(User user) throws Exception;
    List<Goods> selectGoodsOwnerList2(User user) throws Exception;


    /**
     * 根据用户和查询条件name获取商品列表
     * @param userid
     * @param name
     * @return
     * @throws Exception
     */
    List<Goods> selectGoodsByName(String userid , String name) throws Exception;

    /**
     * 根据种类推荐
     * @param categories
     * @return
     */
    List<Goods> selectGoodsSimilarList(String categories);

    /**
     *
     * @param owner
     * @return
     */
    List<Goods> selectGoodsHisList(String owner);

    /**
     * 获取物品详情
     * @return
     * @throws Exception
     */
    Goods selectGoodsDetail(GoodsKey goodsKey)throws Exception;

    /**
     * 更新物品信息
     * @return
     * @throws Exception
     */
    int updateGoodsDetail(Goods goods)throws Exception;

    /**
     * 删除物品
     * @return
     * @throws Exception
     */
    int deleteGoodsDetail(String ids)throws Exception;

    /**
     * 新增物品
     * @return
     * @throws Exception
     */
    int insertGoods(Goods goods)throws Exception;

    /**
     * 获取新id
     * @return
     * @throws Exception
     */
    String getNewGoodsId() throws Exception;

    /**
     * 获取图片最新id
     * @return
     * @throws Exception
     */
    String getNewImgId() throws Exception;

    /**
     * 插入商品图片s
     * @param imgs
     * @return
     * @throws Exception
     */
    int insertGoodsImgs(List<GoodsImg> imgs)throws Exception;

    /**
     * 喜欢的商品
     * @param goodsKey
     * @return
     * @throws Exception
     */
    int enjoyGoods(GoodsKey goodsKey) throws Exception;
}
