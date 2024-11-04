package com.Spring_AOP.Aspact;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfterAOPAspect
{
        private Logger logger = LoggerFactory.getLogger(this.getClass());

       // Weaving and weaver
            @AfterReturning(value = "execution (* com.Spring_AOP.business.*.(..))",
             returning = "result")

            public void afterReturning(JoinPoint joinPoint , Object result)
            {
                logger.info("check for user access");
               logger.info("allowing access",joinPoint, result);
          }

    }
