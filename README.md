# Kafka-Messaging-microservice

Kafka is an open-source distributed event streaming platform that provides great services and is very fast 

before running the project :
  Download Kafka and do some configurations like.
  => in config->zookeeper.properties --> edith the path, it is by default "tmp" change it to your drive. for eg: d:/kefka/zookeeper-data
  => same in server.properties --> path you hav to assign as d:/kefka/kefka-logs
  
 in windows: 
    open cmd: 
       start the zookeeper service by running this command
        .\bin\windows\zookeeper-server-start.bat config/zookeeper.properties 
        for linux use : bin/zookeeper-server-start.sh config/zookeeper.properties
        
      open 2nd cmd: broker service
         .\bin\windows\kafka-server-start.bat config/server.properties
         for linux: bin/kafka-server-start.sh config/server.properties
         
         
        Topic and data services are done in project 
        
        open a new cmd for reading the data or recieving message
        .\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
        for linux:
        bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
        
        and wait for message from spring.
        
        
Also You have to create ProducerFactory and Consumer Factory to communicate for producer to consumer and in main  app use commandline runner to pass the data from producer to consumer side.
