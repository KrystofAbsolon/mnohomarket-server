package io.github.mnohomarket_server;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.mnohomarket_server.Objects.Market;

@SpringBootApplication
public class MnohomarketServerApplication {

	public static ArrayList<Market> markets = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MnohomarketServerApplication.class, args);

		markets.add(new Market(
			1,
			"Bude zítra den?",
			99,
			"https://media.sketchfab.com/models/8267f7d3cbe24a6d968e43408f3edf88/thumbnails/834ee02366654bb5ab1f37daf2aa2279/42e895a4700f4e7386319d66d7c2989b.jpeg"
		));
		markets.add(new Market(
			2,
			"Ukončí se Marek do konce roku 2026?",
			82,
			"https://media.sketchfab.com/models/8267f7d3cbe24a6d968e43408f3edf88/thumbnails/834ee02366654bb5ab1f37daf2aa2279/42e895a4700f4e7386319d66d7c2989b.jpeg"
		));
	}

}
