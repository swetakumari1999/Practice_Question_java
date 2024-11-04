package com.Spring_AOP.Aspact;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;


@Aspect
@Configuration
public class BeforeAspact
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Weaving and weaver
    //@Before("execution (* com.Spring_AOP.business.*.(..))")

//    public void before(JoinPoint joinPoint)
//    {
//        logger.info("check for user access");
//        logger.info("allowing access");
//    }


    //    @AfterThrowing(value = "execution (* com.Spring_AOP.business.*.(..))",
    //    returning = "exception")
    //    public void after(JoinPoint joinPoint, String exception)
    //    {
    //        logger.info("check for user access");
    //        logger.info("allowing access{}", joinPoint, exception);
    //    }


        @Around(value = "execution (* com.Spring_AOP.business.*.(..))")

        public void around(ProceedingJoinPoint joinPoint) throws Throwable
        {
            long startTime = System.currentTimeMillis();
            joinPoint.proceed();
            long timeTaken = System.currentTimeMillis()- startTime;
            logger.info("allowing access by {} is {}",joinPoint, timeTaken);
        }
    }
}
