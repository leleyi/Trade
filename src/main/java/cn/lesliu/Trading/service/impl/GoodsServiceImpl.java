package cn.lesliu.Trading.service.impl;

import cn.lesliu.Trading.dao.GoodsImgMapper;
import cn.lesliu.Trading.dao.GoodsMapper;
import cn.lesliu.Trading.pojo.*;
import cn.lesliu.Trading.service.GoodsService;
import cn.lesliu.Trading.utils.UUIDUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GoodsImgMapper goodsImgMapper;

    @Override
    public List<Goods> selectGoodsFeatureList() throws Exception {
        List<Goods> goods = goodsMapper.selectGoodsFeatureList();
        return goods;
    }

    @Override
    public List<Goods> selectGoodsNewestList() throws Exception {
        List<Goods> goods = goodsMapper.selectGoodsNewestList();
        return goods;
    }

    @Override
    public List<Goods> selectGoodsAdvList() throws Exception {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andAdvIsNotNull();
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods.size() >= 4 ? goods.subList(0, 4) : goods;
    }
    @Override
    public List<Goods> selectGoodsPersonalList(User user) throws Exception {
//        GoodsExample example = new GoodsExample();
//        GoodsExample.Criteria criteria = example.createCriteria();
//        criteria.andUseridEqualTo(user.getId());
//        List<Goods> goods = goodsMapper.selectByExample(example);
        List<Goods> goods = goodsMapper.selectGoodsPersonalList(user);
        return goods;
    }
    public List<Goods> selectGoodsOwnerList(User user) throws Exception{
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(user.getId());
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods.size() >= 3 ? goods.subList(0,3) : goods;
    }

    @Override
    public List<Goods> selectGoodsByName(String userid, String name) throws Exception {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andNameLike("%"+name+"%");
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }

    @Override
    public List<Goods> selectGoodsSimilarList(String categories) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andCategoriesEqualTo(categories);
        List<Goods> goods = goodsMapper.selectByExample(example);
        List<Goods> goods1 = goods.subList(0, 3);
        return goods1;
    }

    @Override
    public List<Goods> selectGoodsHisList(String owner) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andOwnerEqualTo(owner);
        List<Goods> goods = goodsMapper.selectByExample(example);
        List<Goods> goods1 = goods.subList(0, 3);
        return goods1;
    }

    @Override
    public Goods selectGoodsDetail(GoodsKey goodsKey) throws Exception {
        Goods goods = goodsMapper.selectGoodsDetail(goodsKey);
        GoodsImgExample example = new GoodsImgExample();
        GoodsImgExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsidEqualTo(goodsKey.getId());
        List<GoodsImg> goodsImgs = goodsImgMapper.selectByExample(example);
        goods.setImgs(goodsImgs);
        return goods;
    }

    @Override
    public int updateGoodsDetail(Goods goods) throws Exception {
        return goodsMapper.updateByPrimaryKey(goods);
    }
    @Override
    public int deleteGoodsDetail(String ids) throws Exception {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        String[] split = ids.split(",");
        List<String> strings = Arrays.asList(split);
        criteria.andIdIn(strings);
        return goodsMapper.deleteByExample(example);
    }

    @Override
    public int insertGoods(Goods goods) throws Exception {
        return goodsMapper.insert(goods);
    }

    @Override
    public String  getNewGoodsId() throws Exception {
        String goodsID = goodsMapper.selectMaxGoodsID();
        return goodsID == null ? "0" : goodsID;
    }
    @Override
    public String getNewImgId() throws  Exception{
        String imgId = goodsImgMapper.selectMaxImgID();
        return imgId == null ? "0" : imgId;
    }

    @Override
    public int insertGoodsImgs(List<GoodsImg> goodsImgs){
        goodsImgs.stream().forEach(img->{
            try {
                String format = String.format("%08d", Integer.parseInt(getNewImgId()) + 1);
                img.setImgid(format);
                goodsImgMapper.insert(img);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return 1;
    }

    @Override
    public int enjoyGoods(GoodsKey goodsKey) throws Exception {

        goodsMapper.updateEnjoyNum(goodsKey);
        return 0;
    }
}
