package com.digitalinnovationone.checkout.service;


import com.digitalinnovationone.checkout.resource.CheckoutRequest;
import resources.checkout;
import com.digitalinnovationone.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
