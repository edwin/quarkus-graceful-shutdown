# Simulating a Graceful Shutdown using Quarkus

## Concept
Simulating a graceful shutdown using Quarkus when it is killed by sending a SIGTERM signal.

```
$ java -jar quarkus-run.jar

__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2024-03-19 21:31:05,161 INFO  [io.quarkus] (main) quarkus-graceful-shutdown 1.0-SNAPSHOT on JVM (powered by Quarkus 3.4.1) started in 1.408s. Listening on: http://0.0.0.0:8080
2024-03-19 21:31:05,165 INFO  [io.quarkus] (main) Profile prod activated.
2024-03-19 21:31:05,167 INFO  [io.quarkus] (main) Installed features: [cdi, resteasy, resteasy-jackson, smallrye-context-propagation, smallrye-health, vertx]
2024-03-19 21:33:24,662 INFO  [com.edw.ser.IndexService] (Shutdown thread) Application received SIGTERM signal
2024-03-19 21:33:25,663 INFO  [com.edw.ser.IndexService] (Shutdown thread) waiting for 0
2024-03-19 21:33:26,665 INFO  [com.edw.ser.IndexService] (Shutdown thread) waiting for 1
2024-03-19 21:33:27,666 INFO  [com.edw.ser.IndexService] (Shutdown thread) waiting for 2
2024-03-19 21:33:28,667 INFO  [com.edw.ser.IndexService] (Shutdown thread) waiting for 3
2024-03-19 21:33:29,668 INFO  [com.edw.ser.IndexService] (Shutdown thread) waiting for 4
2024-03-19 21:33:29,668 INFO  [com.edw.ser.IndexService] (Shutdown thread) Application Terminate...
2024-03-19 21:33:29,691 INFO  [io.quarkus] (Shutdown thread) quarkus-graceful-shutdown stopped in 5.061s

```