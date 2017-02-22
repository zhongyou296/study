package service.dao;

import org.springframework.stereotype.Repository;
import service.model.HomeDO;

import java.util.List;

/**
 * <p>文件名称：HomeRepository </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/16 </p>
 *
 * @author wangqiming
 */
@Repository
public interface HomeRepository {

    /**
     * 获取HomeDO对象的列表
     *
     * @param max
     * @param count
     * @return
     */
    List<HomeDO> getHomeDOList(long max, int count);
}
