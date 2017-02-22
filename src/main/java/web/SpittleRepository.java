package web;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>文件名称：SpittleRepository </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/18 </p>
 *
 * @author wangqiming
 */
@Repository
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
}
