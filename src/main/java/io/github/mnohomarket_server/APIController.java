package io.github.mnohomarket_server;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @PostMapping("/betyes/{id}")
    public ResponseEntity<Market> incrementYes(@PathVariable("id") Integer id) {  
        try {    
            Market m = MnohomarketServerApplication.markets.get(id - 1);
            m.YesBets += 1;
            return ResponseEntity.ok(m);
        }
        catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/betno/{id}")
    public ResponseEntity<Market> incrementNo(@PathVariable("id") Integer id) {  
        try {    
            Market m = MnohomarketServerApplication.markets.get(id - 1);
            m.NoBets += 1;
            return ResponseEntity.ok(m);
        }
        catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
    
}
