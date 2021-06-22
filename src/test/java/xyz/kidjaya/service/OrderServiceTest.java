package xyz.kidjaya.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.kidjaya.entity.Payment;
import xyz.kidjaya.mapper.PaymentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private PaymentService paymentService;

    @MockBean
    private PaymentMapper paymentMapper;

    private Payment payment;

    @Before
    public void before() {
        payment = new Payment();
        payment.setId("ajdklaj123");
    }

}
