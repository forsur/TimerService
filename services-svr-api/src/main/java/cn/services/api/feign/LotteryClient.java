package cn.services.api.feign;

import cn.services.api.dto.xtimer.LotteryParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("bitstorm-svr-lottery")
public interface LotteryClient
{
    @PostMapping(value = "/v1/get_lucky")
    public Long lotteryV1(@RequestBody LotteryParam lotteryParam);

    @PostMapping(value = "/v2/get_lucky")
    public Long lotteryV2(@RequestBody LotteryParam lotteryParam);

    @PostMapping(value = "/v3/get_lucky")
    public Long lotteryV3(@RequestBody LotteryParam lotteryParam);

}
