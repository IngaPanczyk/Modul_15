package com.kodilla.kodillapatterns2.facade.api;

import com.kodilla.kodillapatterns2.aop.calculator.Watcher;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AspectWatcher {
    private  static final Logger LOGGER = LoggerFactory.getLogger(AspectWatcher.class);
    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto,userId) && target(object)")
    public void logEvent(OrderDto orderDto, Long userId, Object object){
        LOGGER.info("Class: " + object.getClass().getName() + ", UserId: " + userId);
    }
}
