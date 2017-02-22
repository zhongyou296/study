package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>文件名称：HomeController </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/16 </p>
 *
 * @author wangqiming
 */
@Controller
public class HomeController {

    /**
     * 处理对"/"的GET请求
     *
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("我被访问啦");
        model.addAttribute("homepage");
        return "homepage"; // 视图名为home
    }
}
