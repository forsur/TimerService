```
docker run -d \
  --name redis-server \
  -p 6379:6379 \
  -e REDIS_PASSWORD=123456 \
  redis:7.0-alpine
```

```
docker run -d --name nacos-server \
  -e PREFER_HOST_MODE=hostname \
  -e MODE=standalone \
  -e NACOS_AUTH_ENABLE=true \
  -e NACOS_AUTH_USERNAME=nacos \
  -e NACOS_AUTH_PASSWORD=nacos \
  -p 8848:8848 \
  -p 9848:9848 \
  -p 9849:9849 \
  -v nacos-data:/home/nacos/data \
  nacos/nacos-server:2.0.3
```



[Nacos](http://localhost:8848/nacos/#/login)