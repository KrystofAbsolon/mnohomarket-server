package io.github.mnohomarket_server;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return Data.getMarkets();
    }

    @GetMapping("/market")
    public Market getMethodName(@RequestParam("m") int m) {
        return Data.getMarkets().get(m - 1);
    }
    
    @PostMapping("/betyes/{id}")
    public ResponseEntity<Market> incrementYes(@PathVariable("id") Integer id) {  
        try {    
            Market m = Data.getMarkets().get(id - 1);
            m.YesBets += 1;
            return ResponseEntity.ok(m);
        }
        catch(Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/betno/{id}")
    public ResponseEntity<Market> incrementNo(@PathVariable("id") Integer id) {  
        try {    
            Market m = Data.getMarkets().get(id - 1);
            m.NoBets += 1;
            return ResponseEntity.ok(m);
        }
        catch(Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/credit")
    public double getCredit() {
        return Data.getCredit();
    }

    @PostMapping("/credit")
    public void changeCredit(@RequestBody Float amount) {
        double result = Math.round((Data.getCredit() + amount) * 100.0) / 100.0;
        if(result <= 0)
            Data.setCredit(0);
        else
            Data.setCredit(result);
    }
    
    
}
