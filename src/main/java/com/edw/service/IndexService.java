package com.edw.service;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

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

    private Executor executorSrvice = Executors.newFixedThreadPool(1);

    @Startup
    public void init() {
        executorSrvice.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(1000l);
                    logger.info("Inside Thread");
                } catch (Exception ex) {
                    logger.error(ex.getMessage(), ex);
                }

            }
        });
    }

    public void onStop(@Observes ShutdownEvent ev) throws InterruptedException {
        logger.info("Application received SIGTERM signal");

        for (int i = 0; i < 5; i ++) {
            Thread.sleep(5000l);
            logger.info("waiting for {} ", i);
        }

        logger.info("Application Terminate...");
    }

}
