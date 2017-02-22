//package mock;
//
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
///**
// * <p>文件名称：DataService </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：容器类操作的方法</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/16 </p>
// *
// * @author wangqiming
// */
//@Service
//public class RecipientService {
//
//    @Resource
//    private RecipientRepository recipientRepository;
//
//    /**
//     * 添加方法
//     *
//     * @param username
//     * @param email
//     * @return
//     */
//    public String add(String username, String email) {
//        Recipient recipient = recipientRepository.findByEmail(email);
//        String result;
//        if (recipient == null) {
//            recipientRepository.save(new Recipient(username, email));
//            result = "成功";
//        } else {
//            result = "失败";
//        }
//        return result;
//    }
//}
