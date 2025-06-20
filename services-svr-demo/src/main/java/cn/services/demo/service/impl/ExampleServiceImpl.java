package cn.services.demo.service.impl;

import cn.services.common.redis.RedisBase;
import cn.services.demo.mapper.ExampleMapper;
import cn.services.demo.model.Example;
import cn.services.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleMapper exampleMapper;

    @Autowired
    private RedisBase redisBase;



    @Override
    public void save(Example example) {
        exampleMapper.save(example);
    }

    @Override
    public void update(Example example) {
        exampleMapper.update(example);
    }

    @Override
    public Example getExampleById(Long id) {
        return exampleMapper.getExampleById(id);
    }

    @Override
    public void deleteExampleById(Long id) {

        exampleMapper.deleteById(id);
    }

    @Override
    public void cacheExampleToRedis(Example example) {
        redisBase.set(example.getExampleId().toString(),example);
    }

    @Override
    public Example getExampleFromRedis(String exampleId) {
        Object obj = redisBase.get(exampleId);
        Example example = null;
        if (obj != null){
            example = (Example) obj;
        }
        return example;
    }
}
