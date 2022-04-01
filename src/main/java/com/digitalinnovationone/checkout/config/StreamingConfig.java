package com.digitalinnovationone.checkout.config;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import com.digitalinnovationone.checkout.streaming.CheckoutCreatedSource;
import com.digitalinnovationone.checkout.streaming.PaymentPaidSink;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
