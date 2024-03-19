package com.edw.service;

import io.quarkus.runtime.ShutdownEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *     com.edw.service.IndexService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 19 Mar 2024 21:21
 */
@ApplicationScoped
public class IndexService {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    void onStop(@Observes ShutdownEvent ev) throws InterruptedException {
        logger.info("Application received SIGTERM signal");

        for (int i = 0; i < 5; i ++) {
            Thread.sleep(1000l);
            logger.info("waiting for {} ", i);
        }

        logger.info("Application Terminate...");
    }

}
