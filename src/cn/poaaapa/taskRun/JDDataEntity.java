package cn.poaaapa.taskRun;

/**
 * 京东数据模板
 * 商品id，商品名称，商品信息，商品价格，商品评论
 */
public class JDDataEntity {
    Long id;//id
    String goodsName;//商品名称
    String goodsInfo;//商品信息
    String goodsPrice;//商品价格
    String comments;//商品评论

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
