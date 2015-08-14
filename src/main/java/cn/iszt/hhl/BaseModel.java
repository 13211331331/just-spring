package cn.iszt.hhl;

import java.io.Serializable;

/**
 * Created by Administrator on 15-8-13.
 */
public class BaseModel implements Serializable{
    private Integer isS = 0;

    public Integer getIsS() {
        return isS;
    }

    public void setIsS(Integer isS) {
        this.isS = isS;
    }
}
