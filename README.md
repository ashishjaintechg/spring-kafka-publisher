# spring-kafka-publisher
how to publish kafka messages


./zookeeper-server-start.sh ../config/zookeeper.properties

./kafka-server-start.sh ../config/server.properties

./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic test

./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test


./kafka-console-producer.sh --broker-list localhost:9092 --topic test
