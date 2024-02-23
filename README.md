# kafka
Steps to start kafka on windows machine
1. Download kafka.
2. Place in C directory
3. Edit env path.. C:\kafka_2.13-2.7.0\bin\windows
4. create folders in kafka_2.13-2.7.0->
       C:\kafka_2.13-2.7.0\data
       C:\kafka_2.13-2.7.0\data\kafka
       C:\kafka_2.13-2.7.0\data\zookeeper
5. edit zookeeper.properties
    update dataDir=C:/kafka_2.13-2.7.0/data/zookeeper
6. run the command ->zookeeper-server-start.bat config\zookeeper.properties
7. edit server.properties
   log.dirs=C:/kafka_2.13-2.7.0/data/kafka
8. run kafka-server-start.bat config/server.properties
9. to create new topic => 
    kafka-topics --zookeeper 127.0.0.1:2181 --topic kafka-first-topic --create  --partitions 3 --replication-factor 1
10. To list all topic 
   kafka-topics --zookeeper 127.0.0.1:2181 --list
11. To get more info about topic
    kafka-topics --zookeeper 127.0.0.1:2181 --topic kafka-first-topic --describe
12. kafka-console-producer --broker-list 127.0.0.1:9092 --topic kafka-first-topic
13. kafka-console-producer --broker-list 127.0.0.1:9092 --topic kafka-first-topic --producer-property acks=all 
14. kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic kafka-first-topic
15. kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic kafka-first-topic --group my-first-application
16. kafka-consumer-groups --bootstrap-server 127.0.0.1:9092 --list
17. kafka-consumer-groups --bootstrap-server 127.0.0.1:9092 --describe --group my-first-application
18. kafka-consumer-groups --bootstrap-server 127.0.0.1:9092 --group my-first-application --reset-offsets --to-earliest --execute --topic kafka-first-topic
19. kafka-consumer-groups --bootstrap-server 127.0.0.1:9092 --group my-first-application --reset-offsets --to-earliest --shift-by -2 --execute --topic kafka-first-topic
