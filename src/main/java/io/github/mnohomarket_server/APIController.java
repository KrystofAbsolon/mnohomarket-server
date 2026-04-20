package io.github.mnohomarket_server;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.mnohomarket_server.Objects.Market;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/markets")
    public ArrayList<Market> getMethodName() {
        return MnohomarketServerApplication.markets;
    }

    @GetMapping("/market")
    public Market getMethodName(@RequestParam("m") int m) {
        return MnohomarketServerApplication.markets.get(m - 1);
    }
    
    
    
}
