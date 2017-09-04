Starting

Prepare package:
mvn clean package
 
Build docker image:
sudo docker:build

Start linked apps:
sudo docker-compose-up ( -d )

Sometimes docker-compose caches images:
docker-compose ps ( -q )
docker-compose rm

Remember to remove dangling images (caused by Dockerfile builds):
docker rmi $(docker images -f "dangling=true" -q)