//package mock;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.context.ApplicationContext;
//import soundsystem.BaseSpringTest;
//
//import javax.annotation.Resource;
//
//import static java.util.Arrays.asList;
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//import static org.mockito.Matchers.any;
//import static org.mockito.Matchers.anyString;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
///**
// * <p>文件名称：RecipientServiceTest </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/16 </p>
// *
// * @author wangqiming
// */
//public class RecipientServiceTest extends BaseSpringTest {
//
//    @Resource
//    private ApplicationContext applicationContext;
//
//    @Mock
//    private RecipientRepository recipientRepository;
//
//    @InjectMocks
//    private RecipientService recipientService;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testAdd() {
//        when(recipientRepository.findByEmail(anyString())).thenReturn(null);
//        when(recipientRepository.save(any(Recipient.class))).thenReturn(null);
//
//        assertThat(recipientService.add("Tom", "test@test.com"), is("成功"));
//        verify(recipientRepository).findByEmail(anyString());
//        verify(recipientRepository).save(any(Recipient.class));
//    }
//
//    @Test
//    public void testRecipientRepositoryIsExists() {
//        RecipientRepository tmp = applicationContext.getBean(RecipientRepository.class);
//        System.out.println("tmp: " + tmp);
//    }
//}
